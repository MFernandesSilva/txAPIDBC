package txdev.txapidbc;

import me.dpohvar.powernbt.api.NBTCompound;
import me.dpohvar.powernbt.api.NBTManager;
import org.bukkit.entity.Player;

public class NBT {

    public static Integer getPlayerDBCForm(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int form = PlayerPersisted.getInt("jrmcState");
            return form;
        } catch (ClassNotFoundException var4) {
            return null;
        }
    }

    public static Integer getPlayerRace(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int race = PlayerPersisted.getInt("jrmcRace");
            return race;
        } catch (ClassNotFoundException var4) {
            return null;
        }
    }

    public static Integer getHealth(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int health = PlayerPersisted.getInt("jrmcBdy");
            return health;
        } catch (ClassNotFoundException var4) {
            return null;
        }
    }

    public static Double getMaxHealth(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            double maxHealth = (double)(PlayerPersisted.getInt("jrmcCnsI") * 22);
            return maxHealth;
        } catch (ClassNotFoundException var5) {
            return null;
        }
    }

    public static void setHealth(Player player, int health) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            PlayerPersisted.put("jrmcBdy", health);
            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static void setHealthCapped(Player player, int health) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            if ((double)health > getMaxHealth(player)) {
                PlayerPersisted.put("jrmcBdy", getMaxHealth(player));
            } else {
                PlayerPersisted.put("jrmcBdy", health);
            }

            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static int getSTR(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int x = PlayerPersisted.getInt("jrmcStrI");
            return x;
        } catch (ClassNotFoundException var4) {
            return -1;
        }
    }

    public static int getDEX(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int x = PlayerPersisted.getInt("jrmcDexI");
            return x;
        } catch (ClassNotFoundException var4) {
            return -1;
        }
    }

    public static int getCON(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int x = PlayerPersisted.getInt("jrmcCnsI");
            return x;
        } catch (ClassNotFoundException var4) {
            return -1;
        }
    }

    public static int getWIL(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int x = PlayerPersisted.getInt("jrmcWilI");
            return x;
        } catch (ClassNotFoundException var4) {
            return -1;
        }
    }

    public static int getMND(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int x = PlayerPersisted.getInt("jrmcIntI");
            return x;
        } catch (ClassNotFoundException var4) {
            return -1;
        }
    }

    public static int getSPI(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int x = PlayerPersisted.getInt("jrmcCncI");
            return x;
        } catch (ClassNotFoundException var4) {
            return -1;
        }
    }

    public static void setSTR(Player player, int amount) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            if (amount > 100000) {
                PlayerPersisted.put("jrmcStrI", 100000);
            } else {
                PlayerPersisted.put("jrmcStrI", amount);
            }

            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static void setDEX(Player player, int amount) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            if (amount > 100000) {
                PlayerPersisted.put("jrmcDexI", 100000);
            } else {
                PlayerPersisted.put("jrmcDexI", amount);
            }

            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static void setCON(Player player, int amount) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            if (amount > 100000) {
                PlayerPersisted.put("jrmcCnsI", 100000);
            } else {
                PlayerPersisted.put("jrmcCnsI", amount);
            }

            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static void setWIL(Player player, int amount) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            if (amount > 100000) {
                PlayerPersisted.put("jrmcWilI", 100000);
            } else {
                PlayerPersisted.put("jrmcWilI", amount);
            }

            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static void setMND(Player player, int amount) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            if (amount > 100000) {
                PlayerPersisted.put("jrmcIntI", 100000);
            } else {
                PlayerPersisted.put("jrmcIntI", amount);
            }

            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static void setSPI(Player player, int amount) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            if (amount > 100000) {
                PlayerPersisted.put("jrmcCncI", 100000);
            } else {
                PlayerPersisted.put("jrmcCncI", amount);
            }

            Forgadata.put("PlayerPersisted", PlayerPersisted);
            NBTManager.getInstance().writeForgeData(player, Forgadata);
        } catch (ClassNotFoundException var4) {
        }

    }

    public static Integer getRelease(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int release = PlayerPersisted.getInt("jrmcRelease");
            return release;
        } catch (ClassNotFoundException var4) {
            return null;
        }
    }

    public static Integer getStamina(Player player) {
        try {
            Class.forName("me.dpohvar.powernbt.api.NBTManager");
            NBTCompound Forgadata = NBTManager.getInstance().readForgeData(player);
            NBTCompound PlayerPersisted = (NBTCompound)Forgadata.get("PlayerPersisted");
            int stamina = PlayerPersisted.getInt("jrmcStamina");
            return stamina;
        } catch (ClassNotFoundException var4) {
            return null;
        }
    }
}
