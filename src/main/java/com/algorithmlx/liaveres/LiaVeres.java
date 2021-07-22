import com.algorithmlx.liaveres.common.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;

public class LiaVeres implements ModInitializer {

    public static final String ModId = "lv";
    @Override
    public void onInitialize() {
        ModItems.init();
        GeckoLib.initialize();
    }
}