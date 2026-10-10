package sb0;

import android.util.SparseArray;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rb0.InterfaceC43973g;

/* JADX INFO: renamed from: sb0.e */
/* JADX INFO: compiled from: RNGestureHandlerRegistry.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J!\u0010\u0016\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\bR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R$\u0010$\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006%"}, m90084d2 = {"Lsb0/e;", "Lrb0/g;", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "", "j", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "", "handlerTag", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)Lcom/swmansion/gesturehandler/core/GestureHandler;", "viewTag", "actionType", "", "c", "(III)Z", "g", "(I)V", "f", "Ljava/util/ArrayList;", "i", "(I)Ljava/util/ArrayList;", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/View;)Ljava/util/ArrayList;", "k", "(ILcom/swmansion/gesturehandler/core/GestureHandler;)V", "d", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "handlers", "b", "attachedTo", "handlersForView", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNGestureHandlerRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNGestureHandlerRegistry.kt\ncom/swmansion/gesturehandler/react/RNGestureHandlerRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class C44379e implements InterfaceC43973g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<GestureHandler<?>> handlers = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<Integer> attachedTo = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<ArrayList<GestureHandler<?>>> handlersForView = new SparseArray<>();

    @Override // rb0.InterfaceC43973g
    @Nullable
    /* JADX INFO: renamed from: a */
    public synchronized ArrayList<GestureHandler<?>> mo96910a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return m97883i(view.getId());
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m97878c(int handlerTag, int viewTag, int actionType) {
        boolean z11;
        GestureHandler<?> gestureHandler = this.handlers.get(handlerTag);
        if (gestureHandler != null) {
            m97879d(gestureHandler);
            gestureHandler.m71794r0(actionType);
            m97885k(viewTag, gestureHandler);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m97879d(final GestureHandler<?> handler) {
        try {
            Integer num = this.attachedTo.get(handler.getTag());
            if (num != null) {
                this.attachedTo.remove(handler.getTag());
                ArrayList<GestureHandler<?>> arrayList = this.handlersForView.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(handler);
                    }
                    if (arrayList.size() == 0) {
                        this.handlersForView.remove(num.intValue());
                    }
                }
            }
            if (handler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: sb0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C44379e.m97877e(handler);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m97880f() {
        this.handlers.clear();
        this.attachedTo.clear();
        this.handlersForView.clear();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m97881g(int handlerTag) {
        GestureHandler<?> gestureHandler = this.handlers.get(handlerTag);
        if (gestureHandler != null) {
            m97879d(gestureHandler);
            this.handlers.remove(handlerTag);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final synchronized GestureHandler<?> m97882h(int handlerTag) {
        return this.handlers.get(handlerTag);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final synchronized ArrayList<GestureHandler<?>> m97883i(int viewTag) {
        return this.handlersForView.get(viewTag);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m97884j(@NotNull GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlers.put(handler.getTag(), handler);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m97885k(int viewTag, GestureHandler<?> handler) {
        try {
            if (this.attachedTo.get(handler.getTag()) != null) {
                throw new IllegalStateException(("Handler " + handler + " already attached").toString());
            }
            this.attachedTo.put(handler.getTag(), Integer.valueOf(viewTag));
            ArrayList<GestureHandler<?>> arrayList = this.handlersForView.get(viewTag);
            if (arrayList == null) {
                ArrayList<GestureHandler<?>> arrayList2 = new ArrayList<>(1);
                arrayList2.add(handler);
                this.handlersForView.put(viewTag, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(handler);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m97877e(GestureHandler gestureHandler) {
        gestureHandler.m71788o();
    }
}
