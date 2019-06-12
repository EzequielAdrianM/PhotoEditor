package ja.burhanrashid52.photoeditor;

import android.content.Context;
import android.support.annotation.NonNull;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class BaseBrushDrawingViewTest {
    protected Context mContext = RuntimeEnvironment.systemContext;

    @NonNull
    protected BrushDrawingView setupBrushForTouchEvents(BrushViewChangeListener brushViewChangeListener) {
        BrushDrawingView brushDrawingView = new BrushDrawingView(mContext);
        brushDrawingView.setBrushDrawingMode(true);
        brushDrawingView.setBrushViewChangeListener(brushViewChangeListener);
        brushDrawingView.onSizeChanged(500, 500, 500, 500);
        return brushDrawingView;
    }

}
