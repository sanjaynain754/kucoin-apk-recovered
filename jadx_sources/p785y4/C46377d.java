package p785y4;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p683v4.InterfaceC45414a;
import p713w4.InterfaceC45718a;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y4.d */
/* JADX INFO: compiled from: FixedNumberBitmapFramePreparationStrategy.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Ly4/d;", "Ly4/a;", "", "framesToPrepare", "<init>", "(I)V", "Ly4/b;", "bitmapFramePreparer", "Lw4/a;", "bitmapFrameCache", "Lv4/a;", "animationBackend", "lastDrawnFrameNumber", "Lkotlin/Function0;", "", "onAnimationLoaded", "d", "(Ly4/b;Lw4/a;Lv4/a;ILkotlin/jvm/functions/Function0;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "TAG", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46377d implements InterfaceC46374a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int framesToPrepare;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<C46377d> TAG;

    @JvmOverloads
    public C46377d() {
        this(0, 1, null);
    }

    @JvmOverloads
    public C46377d(int i11) {
        this.framesToPrepare = i11;
        this.TAG = C46377d.class;
    }

    @Override // p785y4.InterfaceC46374a
    /* JADX INFO: renamed from: d */
    public void mo102271d(@NotNull InterfaceC46375b bitmapFramePreparer, @NotNull InterfaceC45718a bitmapFrameCache, @NotNull InterfaceC45414a animationBackend, int lastDrawnFrameNumber, @Nullable Function0<Unit> onAnimationLoaded) {
        Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int i11 = this.framesToPrepare;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iMo4283a = (lastDrawnFrameNumber + i12) % animationBackend.mo4283a();
                if (C45999a.m101517w(2)) {
                    C45999a.m101520z(this.TAG, "Preparing frame %d, last drawn: %d", Integer.valueOf(iMo4283a), Integer.valueOf(lastDrawnFrameNumber));
                }
                if (!bitmapFramePreparer.mo102278a(bitmapFrameCache, animationBackend, iMo4283a)) {
                    return;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (onAnimationLoaded != null) {
            onAnimationLoaded.invoke();
        }
    }

    @Override // p785y4.InterfaceC46374a
    /* JADX INFO: renamed from: a */
    public void mo102268a(int i11, int i12, @Nullable Function0<Unit> function0) {
        InterfaceC46374a.a.m102275d(this, i11, i12, function0);
    }

    @Override // p785y4.InterfaceC46374a
    @Nullable
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> mo102269b(int i11, int i12, int i13) {
        return InterfaceC46374a.a.m102273b(this, i11, i12, i13);
    }

    @Override // p785y4.InterfaceC46374a
    /* JADX INFO: renamed from: c */
    public void mo102270c() {
        InterfaceC46374a.a.m102272a(this);
    }

    @Override // p785y4.InterfaceC46374a
    public void onStop() {
        InterfaceC46374a.a.m102274c(this);
    }

    public /* synthetic */ C46377d(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 3 : i11);
    }
}
