package us;

import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.operation.lib.exception.OperationException;
import com.kubi.user.config.UserInfo;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p058cj.C4988a;
import p402kf.C41014a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: us.i */
/* JADX INFO: compiled from: WelfareEx.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000\u001a$\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a$\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0011"}, m90084d2 = {"safeAmount", "", "Ljava/math/BigDecimal;", "scale", "", "(Ljava/math/BigDecimal;Ljava/lang/Integer;)Ljava/lang/String;", "queryUserId", "welfareTrack", "", "locationId", "expose", "", "welfareExpose", "blockId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "welfareClick", "OperationLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareEx.kt\ncom/kubi/operation/lib/cards/welfare/utils/WelfareExKt\n+ 2 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n*L\n1#1,74:1\n45#2,2:75\n*S KotlinDebug\n*F\n+ 1 WelfareEx.kt\ncom/kubi/operation/lib/cards/welfare/utils/WelfareExKt\n*L\n28#1:75,2\n*E\n"})
public final class C45308i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m100176a() {
        UserInfo userInfo = UserInfo.a;
        return userInfo.n() ? userInfo.i() : "";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m100177b(@Nullable BigDecimal bigDecimal, @Nullable Integer num) {
        Throwable th2;
        BigDecimal bigDecimal2;
        int iIntValue;
        Throwable th3;
        if (bigDecimal == null) {
            return "";
        }
        if (num != null) {
            try {
                iIntValue = num.intValue();
            } catch (Throwable th4) {
                th2 = th4;
                bigDecimal2 = bigDecimal;
                C43846g.m96568c(new OperationException(th2, "NewcomerEx", false, null, 8, null), null, 2, null);
                String plainString = bigDecimal2.toPlainString();
                Intrinsics.checkNotNull(plainString);
                return plainString;
            }
        } else {
            try {
                iIntValue = bigDecimal.scale();
            } catch (Throwable th5) {
                th3 = th5;
                bigDecimal2 = bigDecimal;
                th2 = th3;
                C43846g.m96568c(new OperationException(th2, "NewcomerEx", false, null, 8, null), null, 2, null);
                String plainString2 = bigDecimal2.toPlainString();
                Intrinsics.checkNotNull(plainString2);
                return plainString2;
            }
        }
        bigDecimal2 = bigDecimal;
        try {
            return C41014a.m89946t(bigDecimal2, null, iIntValue, true, false, false, false, false, null, 0, 505, null);
        } catch (Throwable th6) {
            th3 = th6;
            th2 = th3;
            C43846g.m96568c(new OperationException(th2, "NewcomerEx", false, null, 8, null), null, 2, null);
            String plainString3 = bigDecimal2.toPlainString();
            Intrinsics.checkNotNull(plainString3);
            return plainString3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m100178c(@NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【Welfare点击埋点】-> pageId:B1homepage blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "mine_track");
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m100179d(String str, String str2, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "1";
        }
        if ((i11 & 4) != 0) {
            jSONObject = null;
        }
        m100178c(str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public static final void m100180e(@NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【Welfare点击埋点】-> pageId:B1homepage blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "mine_track");
        C43852m.m96593e(HomeCardViewHolderProxy.PAGE_ID, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m100181f(String str, String str2, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "1";
        }
        if ((i11 & 4) != 0) {
            jSONObject = null;
        }
        m100180e(str, str2, jSONObject);
    }
}
