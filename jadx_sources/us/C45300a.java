package us;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.operation.lib.api.OperationApi;
import com.kubi.user.config.UserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: us.a */
/* JADX INFO: compiled from: WelfareConfig.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\n0\fH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/utils/WelfareConfig;", "", "<init>", "()V", "TAG", "", "KV_CATE", "api", "Lcom/kubi/operation/lib/api/OperationApi;", "checkWelfareConfig", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "saveUserWelfareTag", "showCard", "isDisplayWelfareCard", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareConfig.kt\ncom/kubi/operation/lib/cards/welfare/utils/WelfareConfig\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,77:1\n47#2,4:78\n19#3,2:82\n*S KotlinDebug\n*F\n+ 1 WelfareConfig.kt\ncom/kubi/operation/lib/cards/welfare/utils/WelfareConfig\n*L\n45#1:78,4\n42#1:82,2\n*E\n"})
public final class C45300a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45300a f101859a = new C45300a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final OperationApi f101860b = (OperationApi) RetrofitFlowExKt.m42820a(OperationApi.class);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m100160a() {
        if (!UserInfo.a.n()) {
            return true;
        }
        String str = UserInfo.c().id;
        if (str.length() == 0) {
            return true;
        }
        return C46392a.m102322d(new StorageId("KV_CATE_WelfareConfig", str, null, false, 12, null), true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m100161b(boolean z11) {
        String str = UserInfo.c().id;
        if (str.length() == 0) {
            return;
        }
        C46392a.m102328k(new StorageId("KV_CATE_WelfareConfig", str, null, false, 12, null), z11);
    }
}
