package com.minestrapp.minestrappolation.init;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class Keys {

    public static final String KEY_CAT_MINESTRAPP = "key.category.minestrappolation";
    public static final String KEY_SHOW_SHIFTTIP = "key.minestrappolation.tip";

    public static final KeyMapping TOOLTIP_KEY = new KeyMapping(KEY_SHOW_SHIFTTIP, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_LEFT_SHIFT, KEY_CAT_MINESTRAPP);
}
