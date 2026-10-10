package y00;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: y00.a */
/* JADX INFO: compiled from: ExperimentSwitch.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, m90084d2 = {"Ly00/a;", "", "<init>", "()V", "", "isOpen", "", "b", "(Z)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "Z", "isAdjustSucEventReport", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46361a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46361a f103951a = new C46361a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isAdjustSucEventReport;

    /* JADX INFO: renamed from: a */
    public final boolean m102235a() {
        return isAdjustSucEventReport;
    }

    /* JADX INFO: renamed from: b */
    public final void m102236b(boolean isOpen) {
        C43840a.m96550d("setAdjustSucEventReport: " + isOpen, "ExperimentSwitch");
        isAdjustSucEventReport = isOpen;
    }
}
