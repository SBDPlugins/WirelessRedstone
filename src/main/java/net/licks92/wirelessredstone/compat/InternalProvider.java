package net.licks92.wirelessredstone.compat;

public class InternalProvider {

    private static InternalBlockData compatBlockData = new InternalBlockData();
    private static InternalWorldEditHooker compatWorldEditHooker = new InternalWorldEditHooker();

    public static InternalBlockData getCompatBlockData() {
        return compatBlockData;
    }

    public static InternalWorldEditHooker getCompatWorldEditHooker() {
        return compatWorldEditHooker;
    }
}
