package com.facebook.fresco.p061ui.common;

import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ForwardingControllerListener2.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0006\b\u0016\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\tJ+\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J+\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m90084d2 = {"Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;", "I", "Lcom/facebook/fresco/ui/common/BaseControllerListener2;", "<init>", "()V", "Lcom/facebook/fresco/ui/common/ControllerListener2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/facebook/fresco/ui/common/ControllerListener2;)V", "m", "", "id", "", "callerContext", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "extras", "i", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "imageInfo", "extraData", "g", "", "throwable", "j", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "", "d", "Ljava/util/List;", "listeners", "e", "Companion", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nForwardingControllerListener2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingControllerListener2.kt\ncom/facebook/fresco/ui/common/ForwardingControllerListener2\n*L\n1#1,84:1\n35#1,16:85\n35#1,16:101\n35#1,16:117\n35#1,16:133\n35#1,16:149\n35#1,16:165\n35#1,16:181\n*S KotlinDebug\n*F\n+ 1 ForwardingControllerListener2.kt\ncom/facebook/fresco/ui/common/ForwardingControllerListener2\n*L\n53#1:85,16\n57#1:101,16\n61#1:117,16\n65#1:133,16\n69#1:149,16\n73#1:165,16\n77#1:181,16\n*E\n"})
public class ForwardingControllerListener2<I> extends BaseControllerListener2<I> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<ControllerListener2<I>> listeners = new ArrayList(2);

    /* JADX INFO: renamed from: l */
    public final synchronized void m8842l(@NotNull ControllerListener2<I> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m8843m(@NotNull ControllerListener2<I> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: a */
    public void mo8835a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).mo8835a(id2);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: g */
    public void mo8836g(@NotNull String id2, @Nullable I imageInfo, @Nullable ControllerListener2.Extras extraData) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).mo8836g(id2, imageInfo, extraData);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: h */
    public void mo8837h(@NotNull String id2, @Nullable ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).mo8837h(id2, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: i */
    public void mo8838i(@NotNull String id2, @Nullable Object callerContext, @Nullable ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).mo8838i(id2, callerContext, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: j */
    public void mo8839j(@NotNull String id2, @Nullable Throwable throwable, @Nullable ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).mo8839j(id2, throwable, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.p061ui.common.BaseControllerListener2, com.facebook.fresco.p061ui.common.ControllerListener2
    public void onIntermediateImageSet(@NotNull String id2, @Nullable I imageInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.listeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                try {
                    this.listeners.get(i11).onIntermediateImageSet(id2, imageInfo);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e11) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e11);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
