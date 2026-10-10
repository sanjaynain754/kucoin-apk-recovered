package vc0;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vc0.c */
/* JADX INFO: compiled from: CompletionHandlerBuilder.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J \u0010\r\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\bJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/common/CompletionHandlerBuilder;", "", "<init>", "()V", "_onSuccess", "Lkotlin/Function0;", "", "_onError", "Lkotlin/Function2;", "", "", "onSuccess", "block", "onError", "build", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45494c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public Function0<Unit> f102525a = new Function0() { // from class: vc0.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45494c.m100457d();
        }
    };

    /* JADX INFO: renamed from: b */
    @NotNull
    public Function2<? super Integer, ? super String, Unit> f102526b = new Function2() { // from class: vc0.b
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C45494c.m100456c(((Integer) obj).intValue(), (String) obj2);
        }
    };

    /* JADX INFO: renamed from: vc0.c$a */
    /* JADX INFO: compiled from: CompletionHandlerBuilder.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/common/CompletionHandlerBuilder$build$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements CompletionHandler {
        public a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            C45494c.this.f102526b.invoke(Integer.valueOf(code), desc);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            C45494c.this.f102525a.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m100456c(int i11, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m100457d() {
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final CompletionHandler m100460g() {
        return new a();
    }

    /* JADX INFO: renamed from: h */
    public final void m100461h(@NotNull Function2<? super Integer, ? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f102526b = block;
    }

    /* JADX INFO: renamed from: i */
    public final void m100462i(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f102525a = block;
    }
}
