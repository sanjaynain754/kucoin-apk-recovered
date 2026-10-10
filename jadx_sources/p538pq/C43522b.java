package p538pq;

import android.content.Intent;
import android.net.Uri;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5264d;
import com.kubi.host.HostManager;
import com.kubi.mine.lib.entity.AppUpgradeEntityV2;
import com.kubi.mine.lib.entity.Channel;
import com.kubi.mine.lib.entity.Link;
import com.kubi.mine.lib.exception.MineException;
import com.kubi.sdk.BaseApplication;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p694vk.C45590s;
import p694vk.C45591t;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: pq.b */
/* JADX INFO: compiled from: AppUpgradeUtil.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/mine/lib/util/AppUpgradeUtil;", "", "<init>", "()V", "gotoTargetMarket", "", "info", "Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;", "gotoTargetUrl", "goToUpgradeApp", "goTOGooglePlay", "goTOKucoin", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppUpgradeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeUtil.kt\ncom/kubi/mine/lib/util/AppUpgradeUtil\n+ 2 MineIssue.kt\ncom/kubi/mine/lib/exception/MineIssueKt\n*L\n1#1,95:1\n44#2,2:96\n*S KotlinDebug\n*F\n+ 1 AppUpgradeUtil.kt\ncom/kubi/mine/lib/util/AppUpgradeUtil\n*L\n29#1:96,2\n*E\n"})
public final class C43522b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43522b f96058a = new C43522b();

    /* JADX INFO: renamed from: a */
    public final void m95770a() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (C5264d.m6169o("com.android.vending")) {
                String packageName = BaseApplication.INSTANCE.get().getPackageName();
                if (!StringsKt.equals("com.kubi.kucoin", packageName != null ? StringsKt.replace$default(packageName, ".debug", "", false, 4, (Object) null) : null, false)) {
                    return;
                }
                Uri uri = Uri.parse("market://details?id=com.kubi.kucoin");
                intent.setPackage("com.android.vending");
                intent.setData(uri);
            } else {
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.kubi.kucoin"));
            }
            intent.addFlags(268435456);
            C5258a.m6129l(intent);
        } catch (Throwable th2) {
            C5258a.m6129l(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.kubi.kucoin")));
            C45591t.f102713a.m100682b("appUpgradeDialog-Dialog_onClick-goTOGooglePlay", th2);
        }
        C45591t.f102713a.m100681a("appUpgradeDialog-Dialog_onClick-goTOGooglePlay");
    }

    /* JADX INFO: renamed from: b */
    public final void m95771b() {
        C5258a.m6129l(new Intent("android.intent.action.VIEW", Uri.parse(HostManager.a.e() + "/download")));
        C45591t.f102713a.m100681a("appUpgradeDialog-Dialog_onClick-goTOKucoin");
    }

    /* JADX INFO: renamed from: c */
    public final void m95772c() {
        C45590s c45590s = C45590s.f102687a;
        if (StringsKt.equals("GOOGLE", c45590s.m100665P(), true)) {
            m95770a();
            return;
        }
        if (StringsKt.equals("KUCOIN", c45590s.m100665P(), true)) {
            m95771b();
            return;
        }
        String strM100665P = c45590s.m100665P();
        C45591t.f102713a.m100681a("appUpgradeDialog-Dialog_onClick-noLegalChannels CHANNEL_VALUE =" + strM100665P);
    }

    /* JADX INFO: renamed from: d */
    public final void m95773d(@NotNull AppUpgradeEntityV2 info) {
        Channel channel;
        Channel channel2;
        Intrinsics.checkNotNullParameter(info, "info");
        boolean zM6129l = false;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Link link = info.getLink();
            intent.setPackage((link == null || (channel2 = link.getChannel()) == null) ? null : channel2.getPackageName());
            Link link2 = info.getLink();
            intent.setData(Uri.parse((link2 == null || (channel = link2.getChannel()) == null) ? null : channel.getUrl()));
            intent.addFlags(268435456);
            zM6129l = C5258a.m6129l(intent);
            C45591t.f102713a.m100681a("appUpgradeDialog-gotoTargetMarket success=" + zM6129l);
        } catch (Throwable th2) {
            f96058a.m95774e(info);
            C43846g.m96568c(new MineException(th2, "GotoTargetMarket", false, null, 8, null), null, 2, null);
            C45591t.f102713a.m100682b("appUpgradeDialog-gotoTargetMarket error", th2);
        }
        if (zM6129l) {
            return;
        }
        m95774e(info);
    }

    /* JADX INFO: renamed from: e */
    public final void m95774e(AppUpgradeEntityV2 appUpgradeEntityV2) {
        String androidLink;
        Link link = appUpgradeEntityV2.getLink();
        if (link != null && link.getAndroidLink() != null) {
            Link link2 = appUpgradeEntityV2.getLink();
            if (link2 != null) {
                androidLink = link2.getAndroidLink();
            } else {
                androidLink = null;
            }
            C5258a.m6129l(new Intent("android.intent.action.VIEW", Uri.parse(androidLink)));
        }
    }
}
