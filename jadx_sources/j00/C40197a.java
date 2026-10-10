package j00;

import com.google.firebase.messaging.FirebaseMessaging;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: j00.a */
/* JADX INFO: compiled from: KPushUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/push/utils/KPushUtils;", "", "<init>", "()V", "getPushChannelName", "", "platform", "", "getPushChannelName$LJiGuang_googleRelease", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40197a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40197a f89328a = new C40197a();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m88550a(byte b11) {
        if (b11 == 0) {
            return "JPUSH_PRIVATE";
        }
        if (b11 == 1) {
            return "XIAOMI";
        }
        if (b11 == 2) {
            return "HUAWEI";
        }
        if (b11 == 3) {
            return "MEIZU";
        }
        if (b11 == 4) {
            return "OPPO";
        }
        if (b11 == 5) {
            return "VIVO";
        }
        return b11 == 8 ? FirebaseMessaging.INSTANCE_ID_SCOPE : "";
    }
}
