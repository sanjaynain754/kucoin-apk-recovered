package aq;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: aq.b */
/* JADX INFO: compiled from: CommonUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u001a\f\u0010\u0016\u001a\u00020\u0005*\u00020\u0007H\u0000\u001aA\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0004\b\u0000\u0010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00012\u000e\b\u0004\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001cH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001aI\u0010\u001e\u001a\u00020\u001f*\u00020 2\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00012\u001e\b\u0004\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\"\u001a?\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\u001b\b\u0002\u0010'\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\u0002\b)H\u0000\u001a?\u0010*\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00072\u001b\b\u0002\u0010'\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\u0002\b)H\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0010\u001a\u00020\u0007*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, m90084d2 = {"defaultNeedCatch", "", "getDefaultNeedCatch", "()Z", "showSelectDialog", "", "tag", "", "fragment", "Landroidx/fragment/app/Fragment;", "selectList", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "block", "Lkotlin/Function1;", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "language", "", "getLanguage", "(I)Ljava/lang/String;", "formatArgs", "", "log", "marketMonitorSafeCall", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "bizType", "needCatch", "Lkotlin/Function0;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "marketMonitorLaunchOnIO", "Lkotlinx/coroutines/Job;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/coroutines/Continuation;", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "trackExpose", "pageId", "blockId", "locationId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "Lkotlin/ExtensionFunctionType;", "trackClick", "MarketMonitorLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n+ 2 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,163:1\n45#2,4:164\n*S KotlinDebug\n*F\n+ 1 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n*L\n76#1:164,4\n*E\n"})
public final class C4373b {

    /* JADX INFO: renamed from: a */
    public static final boolean f3771a = true;

    /* JADX INFO: renamed from: b */
    public static final boolean m3900b() {
        return f3771a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m3901c(int i11) {
        return C27017c.f54310a.m66516f(i11, new Object[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m3902d(int i11, @Nullable Object obj) {
        return C27017c.f54310a.m66516f(i11, obj);
    }

    /* JADX INFO: renamed from: e */
    public static final void m3903e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C44128b.m97259c("FloatingWindow", str);
    }

    /* JADX INFO: renamed from: f */
    public static final void m3904f(@NotNull String tag, @NotNull Fragment fragment, @NotNull List<SelectEntity> selectList, @NotNull final Function1<? super BottomSheetDialogHelper.InterfaceC24339a, Unit> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(selectList, "selectList");
        Intrinsics.checkNotNullParameter(block, "block");
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, selectList, new BiConsumer() { // from class: aq.a
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C4373b.m3906h(block, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, tag);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3905g(String str, Fragment fragment, List list, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        m3904f(str, fragment, list, function1);
    }

    /* JADX INFO: renamed from: i */
    public static final void m3907i(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable Function1<? super JSONObject, Unit> function1) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        if (function1 == null) {
            m3903e("【悬浮窗点击埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + ' ');
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            function1.invoke(jSONObject2);
            m3903e("【悬浮窗点击埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject2);
            Unit unit = Unit.INSTANCE;
            jSONObject = jSONObject2;
        }
        C43852m.m96589a(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m3908j(String str, String str2, String str3, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        m3907i(str, str2, str3, function1);
    }

    /* JADX INFO: renamed from: k */
    public static final void m3909k(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable Function1<? super JSONObject, Unit> function1) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        if (function1 == null) {
            m3903e("【悬浮窗曝光埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId);
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            function1.invoke(jSONObject2);
            m3903e("【悬浮窗曝光埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject2);
            Unit unit = Unit.INSTANCE;
            jSONObject = jSONObject2;
        }
        C43852m.m96593e(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m3910l(String str, String str2, String str3, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        m3909k(str, str2, str3, function1);
    }

    /* JADX INFO: renamed from: h */
    public static final void m3906h(Function1 function1, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        Intrinsics.checkNotNull(interfaceC24339a);
        function1.invoke(interfaceC24339a);
    }
}
