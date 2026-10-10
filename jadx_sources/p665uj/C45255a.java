package p665uj;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.home.widgets.HomeRecyclerView;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiHomeFeedFeedTabItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import d00.InterfaceC36573h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233ej.C37201i;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: uj.a */
/* JADX INFO: compiled from: KCRnBridgeHomeFeedCallImpl.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JF\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JH\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000e2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JH\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JP\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000e2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016JT\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!0 2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/v2/knb/rn/KCRnBridgeHomeFeedCallImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiHomeFeedModule;", "<init>", "()V", "getFeedTabPos", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getHomeFeedTabs", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiHomeFeedFeedTabItem;", "getNativeFeedVisibleHeight", "isFeedLiveTabRemoteConfigOpen", "", "onClickHomeFeedTab", ViewProps.POSITION, "scrollWithVelocity", "velocity", "", "updateHomeFeedTabs", "updatedTabsJson", "selectedIndex", "sendFeedEvent", ReportDataTable.COLUMN_PARAMS, "", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCRnBridgeHomeFeedCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRnBridgeHomeFeedCallImpl.kt\ncom/kubi/home/v2/knb/rn/KCRnBridgeHomeFeedCallImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1563#2:113\n1634#2,3:114\n774#2:117\n865#2,2:118\n*S KotlinDebug\n*F\n+ 1 KCRnBridgeHomeFeedCallImpl.kt\ncom/kubi/home/v2/knb/rn/KCRnBridgeHomeFeedCallImpl\n*L\n38#1:113\n38#1:114,3\n40#1:117\n40#1:118,2\n*E\n"})
public final class C45255a implements InterfaceC36573h {
    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: a */
    public void mo81864a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiHomeFeedFeedTabItem>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<HomeFeedTab> listM83228q = C37201i.f82500a.m83228q();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM83228q, 10));
        for (HomeFeedTab homeFeedTab : listM83228q) {
            String code = homeFeedTab.getCode();
            if (code == null) {
                code = "";
            }
            Boolean display = homeFeedTab.getDisplay();
            arrayList.add(new KCJSApiHomeFeedFeedTabItem(code, display != null ? display.booleanValue() : false));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((KCJSApiHomeFeedFeedTabItem) obj2).getCode().length() > 0) {
                arrayList2.add(obj2);
            }
        }
        callback.invoke(arrayList2, null);
    }

    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: b */
    public void mo81865b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Long.valueOf(C37201i.f82500a.m83227p()), null);
    }

    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: c */
    public void mo81866c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, double d11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_scroll_vertical_speed", Integer.valueOf((int) d11), 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: d */
    public void mo81867d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> params, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.event.FlutterEvent:flutterCommonEvent", params, 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: e */
    public void mo81868e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Long.valueOf(HomeRecyclerView.f26643A.getFeedCardVisibleHeight()), null);
    }

    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: f */
    public void mo81869f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String updatedTabsJson, long j11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(updatedTabsJson, "updatedTabsJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C37201i.f82500a.m83218K(updatedTabsJson, (int) j11);
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_tab_changed", null, 0L, 6, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: g */
    public void mo81870g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, long j11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i11 = (int) j11;
        C37201i.f82500a.m83219M(i11);
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", Integer.valueOf(i11), 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // d00.InterfaceC36573h
    /* JADX INFO: renamed from: h */
    public void mo81871h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(C37201i.f82500a.m83210A()), null);
    }
}
