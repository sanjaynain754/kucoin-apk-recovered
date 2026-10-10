package com.kubi.router.model;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IRedirect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00032\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/router/model/IRedirect;", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Companion", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public interface IRedirect {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f46206a;

    /* JADX INFO: compiled from: IRedirect.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, m90084d2 = {"Lcom/kubi/router/model/IRedirect$Companion;", "", "()V", "obtain", "Lcom/kubi/router/model/IRedirect;", "block", "Lkotlin/Function0;", "", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f46206a = new Companion();

        /* JADX INFO: renamed from: com.kubi.router.model.IRedirect$Companion$a */
        /* JADX INFO: compiled from: IRedirect.kt */
        @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/kubi/router/model/IRedirect$Companion$a", "Lcom/kubi/router/model/IRedirect;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
        public static final class C23634a implements IRedirect {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Function0<Unit> f46207b;

            public C23634a(Function0<Unit> function0) {
                this.f46207b = function0;
            }

            @Override // com.kubi.router.model.IRedirect
            /* JADX INFO: renamed from: a */
            public void mo45709a() {
                this.f46207b.invoke();
            }
        }

        @NotNull
        public final IRedirect obtain(@NotNull Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C23634a(block);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo45709a();
}
