package p795yf;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: yf.i */
/* JADX INFO: compiled from: PathVirtualApkChecker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, m90084d2 = {"Lyf/i;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Z", "", "", "b", "[Ljava/lang/String;", "virtualPKGs", "c", "virtualPaths", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPathVirtualApkChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathVirtualApkChecker.kt\ncom/kubi/fingerprint/utils/PathVirtualApkChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public final class C46483i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46483i f104243a = new C46483i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String[] virtualPKGs = {"com.bly.dkplat", "com.by.chaos", "com.lbe.parallel", "com.excelliance.dualaid", "com.lody.virtual", "com.qihoo.magic", "multi.parallel.dualspace.cloner", "yushu.android.accounts", "do.multiple.cloner", "com.polestar.super.clone", "com.excelliance.multiaccounts", "com.pengyou.cloneapp", "com.lbe.parallel.intl", "com.nams.and.wkabd", "com.cloneapp.parallelspace.dualspace", "com.excelliance.multiaccount", "com.polar.apps.dual.multi.accounts", "com.trendmicro.tmas", "com.ludashi.dualspaceprox", "com.jumobile.smartapp", "com.jumobile.multiapp", "com.mobiorca.whatsaccount.addon.arm64", "yushu.android.accounts", "com.jihai.Dualwhatsappaccounts", "com.ludashi.superboost", "com.excelliance.multiaccounts.b32", "mochat.multiple.parallel.whatsclone", "com.ludashi.dualspace", "multiple.accounts.download.fbvideodownloader", "com.excean.parallelspace", "com.oasisfeng.island", "com.vmos.ggp", "com.limingapp.multaccount", "com.pspace.vandroid", "com.matey.robot", "com.jihai.parallel.whatsapp.account", "com.parallel.multi.accounts.spaces.multiple.lite.clone", "com.multi.accounts.parallel.space.dual.clon.assist.app", "com.dual.space.parallel.app.clone.multiple", "com.excelliance.multiaccounts.b32", "com.cloneapp.parallelspace.dualspace.arm32", "com.spencerstudios.multiappuninstaller", "com.dualspace.dualaccount.multispace.space", "clone.parallelspace.multipleaccounts.clonewhatsapp", "com.app.hider.master.dual.app.lite", "com.dual.space.parallel.apps.multiaccounts.appscloner", "com.ludashi.dualspace.addon.arm32", "com.app.hider.master.dual.app", "com.dual.space.parallel.app.clone.multiple", "com.ludashi.dualspaceprox.addon.arm32", "com.ludashi.superboost.addon.arm32", "com.parallelapps.dualappspro", "com.equeo.dyson", "com.ludashi.multspace.addon.arm64", "com.parallel.space.pro", "parallel.space.pro", "com.multipleaccounts.parallelspace.cloneapp.clonewhatsapp", "com.cloner.android", "com.magic.cloneapp", "com.lbe.parallel.intl.arm64", "com.parallel.space.pro.arm32", "com.parallel.space.lite.arm32", "com.lbe.parallel.intl.arm32", "com.parallel.space.pro.arm64", "com.parallel.space.lite.arm64", "com.ludashi.dualspaceproex.addon.arm32", "com.ludashi.multspace.addon.arm32", "com.dualspace.dualaccount.multispace.space", "do.multiple.cloner", "pro.dual.space.multiple.clone", "com.laxmisoft.dualspace", "com.dgl.dualspace.multiaccounts.parallel.appcloner", "com.ninetyplus.dualapp", "com.toolboxs.parallel.space.multi.account.dualspace", "com.pspace.vandroid", "com.directworks.dualappspro", "com.applisto.appcloner.premium", "com.parallel.spaces.multi.accounts.app", "com.dualspace.multispace.android"};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String[] virtualPaths = {"/gameplugins/", "/virtual/", "dkplugin.", "/vbox/"};

    /* JADX INFO: renamed from: a */
    public final boolean m102550a(@NotNull Context context) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        String path = context.getFilesDir().getPath();
        String[] strArr = virtualPKGs;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= length) {
                str2 = null;
                break;
            }
            str2 = strArr[i11];
            Intrinsics.checkNotNullExpressionValue(path, "path");
            if (StringsKt.contains$default((CharSequence) path, (CharSequence) str2, false, 2, (Object) null)) {
                break;
            }
            i11++;
        }
        boolean z11 = str2 != null;
        for (String str3 : virtualPaths) {
            Intrinsics.checkNotNullExpressionValue(path, "path");
            if (StringsKt.contains$default((CharSequence) path, (CharSequence) str3, false, 2, (Object) null)) {
                str = str3;
                break;
            }
        }
        return z11 || (str != null);
    }
}
