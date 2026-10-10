package rb0;

import android.view.MotionEvent;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.swmansion.gesturehandler.core.GestureHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rb0.l */
/* JADX INFO: compiled from: OnTouchEventListener.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lrb0/l;", "", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "handler", "Landroid/view/MotionEvent;", "event", "", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;)V", "", "newState", "oldState", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC43978l {
    /* JADX INFO: renamed from: a */
    <T extends GestureHandler<T>> void mo72034a(@NotNull T handler, int newState, int oldState);

    /* JADX INFO: renamed from: b */
    <T extends GestureHandler<T>> void mo72035b(@NotNull T handler);

    /* JADX INFO: renamed from: c */
    <T extends GestureHandler<T>> void mo72036c(@NotNull T handler, @NotNull MotionEvent event);
}
