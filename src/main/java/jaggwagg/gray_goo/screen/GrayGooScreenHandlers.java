package jaggwagg.gray_goo.screen;

import jaggwagg.gray_goo.GrayGoo;
import jaggwagg.gray_goo.client.gui.screen.NaniteModifierScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class GrayGooScreenHandlers {
    public static ScreenHandlerType<NaniteModifierScreenHandler> NANITE_ASSEMBLER;

    public static void init() {
        NANITE_ASSEMBLER = Registry.register(Registries.SCREEN_HANDLER, new Identifier(GrayGoo.MOD_ID, "nanite_assembler"), new ScreenHandlerType<>(NaniteModifierScreenHandler::new, null));
    }

    public static void initClient() {
        HandledScreens.register(NANITE_ASSEMBLER, NaniteModifierScreen::new);
    }
}
