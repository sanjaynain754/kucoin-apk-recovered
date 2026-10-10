package rb0;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.swmansion.gesturehandler.core.PointerEventsConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rb0.q */
/* JADX INFO: compiled from: ViewConfigurationHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lrb0/q;", "", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/swmansion/gesturehandler/core/PointerEventsConfig;", "c", "(Landroid/view/View;)Lcom/swmansion/gesturehandler/core/PointerEventsConfig;", "Landroid/view/ViewGroup;", "parent", "", "index", "b", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/ViewGroup;)Z", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC43983q {
    /* JADX INFO: renamed from: a */
    boolean mo96939a(@NotNull ViewGroup view);

    @NotNull
    /* JADX INFO: renamed from: b */
    View mo96940b(@NotNull ViewGroup parent, int index);

    @NotNull
    /* JADX INFO: renamed from: c */
    PointerEventsConfig mo96941c(@NotNull View view);
}
