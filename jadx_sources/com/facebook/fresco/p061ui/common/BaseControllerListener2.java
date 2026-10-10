package com.facebook.fresco.p061ui.common;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseControllerListener2.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\b\b\u0016\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m90084d2 = {"Lcom/facebook/fresco/ui/common/BaseControllerListener2;", "INFO", "Lcom/facebook/fresco/ui/common/ControllerListener2;", "<init>", "()V", "", "id", "", "callerContext", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "extras", "", "i", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "imageInfo", "extraData", "g", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "", "throwable", "j", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "b", "Companion", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class BaseControllerListener2<INFO> implements ControllerListener2<INFO> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ControllerListener2<?> f8479c = new BaseControllerListener2();

    /* JADX INFO: compiled from: BaseControllerListener2.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0001\u0010\u0007H\u0007R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/facebook/fresco/ui/common/BaseControllerListener2$Companion;", "", "<init>", "()V", "NO_OP_LISTENER", "Lcom/facebook/fresco/ui/common/ControllerListener2;", "getNoOpListener", "I", "ui-common_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final <I> ControllerListener2<I> getNoOpListener() {
            ControllerListener2<I> controllerListener2 = BaseControllerListener2.f8479c;
            Intrinsics.checkNotNull(controllerListener2, "null cannot be cast to non-null type com.facebook.fresco.ui.common.ControllerListener2<I of com.facebook.fresco.ui.common.BaseControllerListener2.Companion.getNoOpListener>");
            return controllerListener2;
        }
    }

    @Override // com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: a */
    public void mo8835a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: g */
    public void mo8836g(@NotNull String id2, @Nullable INFO imageInfo, @Nullable ControllerListener2.Extras extraData) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: h */
    public void mo8837h(@NotNull String id2, @Nullable ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: i */
    public void mo8838i(@NotNull String id2, @Nullable Object callerContext, @Nullable ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.p061ui.common.ControllerListener2
    /* JADX INFO: renamed from: j */
    public void mo8839j(@NotNull String id2, @Nullable Throwable throwable, @Nullable ControllerListener2.Extras extras) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.p061ui.common.ControllerListener2
    public void onIntermediateImageSet(@NotNull String id2, @Nullable INFO imageInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }
}
