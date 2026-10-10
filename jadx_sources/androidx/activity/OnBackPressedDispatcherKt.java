package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"addCallback", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/activity/OnBackPressedDispatcher;", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "enabled", "", "onBackPressed", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "activity_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class OnBackPressedDispatcherKt {
    @NotNull
    public static final OnBackPressedCallback addCallback(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @Nullable LifecycleOwner lifecycleOwner, final boolean z11, @NotNull final Function1<? super OnBackPressedCallback, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z11) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
            return onBackPressedCallback;
        }
        onBackPressedDispatcher.addCallback(onBackPressedCallback);
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z11, function1);
    }
}
