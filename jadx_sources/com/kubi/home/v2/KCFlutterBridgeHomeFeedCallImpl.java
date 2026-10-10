package com.kubi.home.v2;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import b00.InterfaceC4427j;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.home.widgets.HomeRecyclerView;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeHomeFeedFeedTabItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p233ej.C37201i;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCFlutterBridgeHomeFeedCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J4\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\n2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00162\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J>\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00162\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016¨\u0006!"}, m90084d2 = {"Lcom/kubi/home/v2/KCFlutterBridgeHomeFeedCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeHomeFeedCall;", "<init>", "()V", "getFeedTabPos", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getHomeFeedTabs", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeHomeFeedFeedTabItem;", "getNativeFeedVisibleHeight", "onClickHomeFeedTab", ViewProps.POSITION, "", "isFeedLiveTabRemoteConfigOpen", "scrollWithVelocity", "velocity", "", "sendFeedTabOffsetX", TypedValues.CycleType.S_WAVE_OFFSET, "updateHomeFeedTabs", "updatedTabsJson", "", "selectedIndex", "sendLiveStartAlpha", "alpha", "nativeVibrate", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeHomeFeedCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeHomeFeedCallImpl.kt\ncom/kubi/home/v2/KCFlutterBridgeHomeFeedCallImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1563#2:123\n1634#2,3:124\n774#2:127\n865#2,2:128\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeHomeFeedCallImpl.kt\ncom/kubi/home/v2/KCFlutterBridgeHomeFeedCallImpl\n*L\n37#1:123\n37#1:124,3\n39#1:127\n39#1:128,2\n*E\n"})
public final class KCFlutterBridgeHomeFeedCallImpl implements InterfaceC4427j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f26362a = new Companion(null);

    /* JADX INFO: compiled from: KCFlutterBridgeHomeFeedCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/v2/KCFlutterBridgeHomeFeedCallImpl$Companion;", "", "<init>", "()V", "TAG", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: a */
    public void mo4136a(@NotNull Context ctx, double d11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: b */
    public void mo4137b(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object systemService = ctx.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator == null) {
            C44128b.m97259c("KCFlutterBridgeHomeFeed", "[nativeVibrate] vibrator is null");
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(20L, 30));
        } else {
            vibrator.vibrate(20L);
        }
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: c */
    public void mo4138c(@NotNull Context ctx, double d11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_scroll_vertical_speed", Integer.valueOf((int) d11), 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: d */
    public void mo4139d(@NotNull Context ctx, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Long.valueOf(HomeRecyclerView.f26643A.getFeedCardVisibleHeight()), null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: e */
    public void mo4140e(@NotNull Context ctx, long j11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i11 = (int) j11;
        C37201i.f82500a.m83219M(i11);
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", Integer.valueOf(i11), 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: f */
    public void mo4141f(@NotNull Context ctx, @NotNull Function2<? super List<KCFlutterBridgeHomeFeedFeedTabItem>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<HomeFeedTab> listM83228q = C37201i.f82500a.m83228q();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM83228q, 10));
        for (HomeFeedTab homeFeedTab : listM83228q) {
            String code = homeFeedTab.getCode();
            if (code == null) {
                code = "";
            }
            Boolean display = homeFeedTab.getDisplay();
            arrayList.add(new KCFlutterBridgeHomeFeedFeedTabItem(code, display != null ? display.booleanValue() : false));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((KCFlutterBridgeHomeFeedFeedTabItem) obj).getCode().length() > 0) {
                arrayList2.add(obj);
            }
        }
        callback.invoke(arrayList2, null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: g */
    public void mo4142g(@NotNull Context ctx, double d11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_tab_offset_x_change", Double.valueOf(d11), 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: h */
    public void mo4143h(@NotNull Context ctx, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Long.valueOf(C37201i.f82500a.m83227p()), null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: i */
    public void mo4144i(@NotNull Context ctx, @NotNull String updatedTabsJson, long j11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(updatedTabsJson, "updatedTabsJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C37201i.f82500a.m83218K(updatedTabsJson, (int) j11);
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_tab_changed", null, 0L, 6, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4427j
    /* JADX INFO: renamed from: j */
    public void mo4145j(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(C37201i.f82500a.m83210A()), null);
    }
}
