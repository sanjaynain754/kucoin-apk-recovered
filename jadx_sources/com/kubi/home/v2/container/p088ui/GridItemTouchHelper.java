package com.kubi.home.v2.container.p088ui;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.UiThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$id;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.v2.card.HomeCardsRepositoryV2;
import com.kubi.home.v2.container.p088ui.GridItemTouchHelper;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.InnerViewHolder;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p562qj.C43745a;
import p562qj.C43764t;
import p562qj.C43766v;
import p562qj.C43767w;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridItemTouchHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u0000 _*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004:\u0003_`aB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0015J>\u0010&\u001a\u00020\u001c26\u0010'\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0017J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u000eJ0\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010+\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0016J \u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011H\u0016J\b\u00106\u001a\u00020\u000eH\u0016J\b\u00107\u001a\u00020\u000eH\u0016J\u0018\u00108\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u00112\u0006\u00109\u001a\u00020/H\u0016J \u0010:\u001a\u00020\u000e2\u0006\u00102\u001a\u0002032\u0006\u0010;\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011H\u0016J\u001a\u0010<\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u00010\u00112\u0006\u0010=\u001a\u00020/H\u0016J\u0018\u0010>\u001a\u00020\u001c2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0011H\u0016J\u000e\u0010?\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0011J\u0006\u0010@\u001a\u00020\u001cJ\u0014\u0010A\u001a\u00020\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010B\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0011H\u0002J\u001a\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010G\u001a\u00020\u001cH\u0002J\b\u0010H\u001a\u00020\u001cH\u0002J\b\u0010I\u001a\u00020\u001cH\u0002J\u0014\u0010J\u001a\u00020\u001c2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000LJ\u001e\u0010M\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u00112\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020OJ \u0010R\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00112\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020OH\u0002J\u000e\u0010S\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0011J\u0010\u0010T\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0007J\u001c\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\u000e2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0011H\u0007J\u0006\u0010W\u001a\u00020\u000eJ\u0010\u0010X\u001a\u00020\u001c2\u0006\u0010Y\u001a\u00020EH\u0016J\u0012\u0010Z\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010[\u001a\u00020\u001c2\b\u0010\\\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010]\u001a\u00020\u001cH\u0002J\b\u0010^\u001a\u00020\u001cH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R@\u0010\u0016\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006b"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "Landroid/view/View$OnClickListener;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "adapter", "Lcom/kubi/home/v2/container/ui/GridAdapter;", "widgetActionHandler", "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$WidgetActionHandler;", "<init>", "(Lcom/kubi/home/v2/container/ui/GridAdapter;Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$WidgetActionHandler;)V", "handler", "Landroid/os/Handler;", "isInDragMode", "", "isInEditMode", "editModeViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dragDelayRunnable", "Ljava/lang/Runnable;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "quickChangeListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "oldData", "newData", "", FirebaseAnalytics.Event.LOGIN, "shakeAnimationManager", "Lcom/kubi/home/v2/container/ui/ShakeAnimationManager;", "getShakeAnimationManager", "()Lcom/kubi/home/v2/container/ui/ShakeAnimationManager;", "popupManu", "Lcom/kubi/home/v2/container/ui/HomePopMenu;", "setItemTouchHelper", "touchHelper", "setQuickChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateLoginState", "userLogin", "chooseDropTarget", "selected", "dropTargets", "", "curX", "", "curY", "onMove", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "target", "isLongPressDragEnabled", "isItemViewSwipeEnabled", "onSwiped", "direction", "canDropOver", "current", "onSelectedChanged", "actionState", "clearView", "handleLongPress", "handleTouchUp", "enterDragMode", "enterEditMode", "showPopMenu", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "cardData", "exitEditMode", "exitDragMode", "tryToUpdateBottomGap", "handleShakeStateForAttachedView", "cardViewHolder", "Lcom/kubi/sdk/InnerViewHolder;", "handleCardClick", "x", "", "y", "boxSize", "isClickCloseIcon", "handleDragGesture", "setupTouchHandler", "setDraggingState", "dragging", "onBackPressed", "onClick", "v", "showCardDetail", "handleRemoveWidget", C33954u6.f72238i, "handleEditHomeWidget", "handleShowAddList", "Companion", "WidgetActionHandler", "ItemTouchHandler", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridItemTouchHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridItemTouchHelper.kt\ncom/kubi/home/v2/container/ui/GridItemTouchHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,793:1\n1#2:794\n*E\n"})
public final class GridItemTouchHelper<T extends BaseCardDataV2> extends ItemTouchHelper.SimpleCallback implements View.OnClickListener {

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Companion f26520o = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C43745a<BaseCardDataV2> f26521b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC15003b f26522c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Handler f26523d;

    /* JADX INFO: renamed from: e */
    public boolean f26524e;

    /* JADX INFO: renamed from: f */
    public boolean f26525f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public RecyclerView.ViewHolder f26526g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Runnable f26527h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public ItemTouchHelper f26528i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function2<? super BaseCardDataV2, ? super BaseCardDataV2, Unit> f26529j;

    /* JADX INFO: renamed from: k */
    public boolean f26530k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final C43767w<T> f26531l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public C43764t f26532m;

    /* JADX INFO: renamed from: n */
    public final int f26533n;

    /* JADX INFO: compiled from: GridItemTouchHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$Companion;", "", "<init>", "()V", "DRAG_DELAY_MS", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.container.ui.GridItemTouchHelper$a */
    /* JADX INFO: compiled from: GridItemTouchHelper.kt */
    @Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$ItemTouchHandler;", "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;", "moveThreshold", "", "longPressTimeout", "", "onClick", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "onLongPress", "Lkotlin/Function1;", "onDragStart", "onTouchUp", "Lkotlin/Function0;", "<init>", "(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;IJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "initialX", "initialY", "hasMoved", "", "downView", "Landroid/view/View;", "downHolder", "handler", "Landroid/os/Handler;", "longPressTriggered", "longPressRunnable", "Ljava/lang/Runnable;", "onInterceptTouchEvent", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "onTouchEvent", "onRequestDisallowInterceptTouchEvent", "disallowIntercept", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGridItemTouchHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridItemTouchHelper.kt\ncom/kubi/home/v2/container/ui/GridItemTouchHelper$ItemTouchHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,793:1\n1#2:794\n*E\n"})
    public final class C15002a implements RecyclerView.OnItemTouchListener {

        /* JADX INFO: renamed from: a */
        public final int f26534a;

        /* JADX INFO: renamed from: b */
        public final long f26535b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Function3<RecyclerView.ViewHolder, Float, Float, Unit> f26536c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final Function1<RecyclerView.ViewHolder, Unit> f26537d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final Function1<RecyclerView.ViewHolder, Unit> f26538e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final Function0<Unit> f26539f;

        /* JADX INFO: renamed from: g */
        public float f26540g;

        /* JADX INFO: renamed from: h */
        public float f26541h;

        /* JADX INFO: renamed from: i */
        public boolean f26542i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public View f26543j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public RecyclerView.ViewHolder f26544k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public final Handler f26545l;

        /* JADX INFO: renamed from: m */
        public boolean f26546m;

        /* JADX INFO: renamed from: n */
        @NotNull
        public final Runnable f26547n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ GridItemTouchHelper<T> f26548o;

        /* JADX WARN: Multi-variable type inference failed */
        public C15002a(GridItemTouchHelper gridItemTouchHelper, int i11, @NotNull long j11, @NotNull Function3<? super RecyclerView.ViewHolder, ? super Float, ? super Float, Unit> onClick, @NotNull Function1<? super RecyclerView.ViewHolder, Unit> onLongPress, @NotNull Function1<? super RecyclerView.ViewHolder, Unit> onDragStart, Function0<Unit> onTouchUp) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
            Intrinsics.checkNotNullParameter(onDragStart, "onDragStart");
            Intrinsics.checkNotNullParameter(onTouchUp, "onTouchUp");
            this.f26548o = gridItemTouchHelper;
            this.f26534a = i11;
            this.f26535b = j11;
            this.f26536c = onClick;
            this.f26537d = onLongPress;
            this.f26538e = onDragStart;
            this.f26539f = onTouchUp;
            this.f26545l = new Handler(Looper.getMainLooper());
            this.f26547n = new Runnable() { // from class: qj.h
                @Override // java.lang.Runnable
                public final void run() {
                    GridItemTouchHelper.C15002a.m30866b(this.f96726b);
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public static final void m30866b(C15002a c15002a) {
            RecyclerView.ViewHolder viewHolder = c15002a.f26544k;
            if (viewHolder != null) {
                c15002a.f26546m = true;
                c15002a.f26537d.invoke(viewHolder);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        
            if (r0 != 3) goto L107;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onInterceptTouchEvent(@NotNull RecyclerView rv2, @NotNull MotionEvent e11) throws JSONException {
            Intrinsics.checkNotNullParameter(rv2, "rv");
            Intrinsics.checkNotNullParameter(e11, "e");
            if (!this.f26548o.f26530k) {
                return false;
            }
            int actionMasked = e11.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        float fAbs = Math.abs(e11.getX() - this.f26540g);
                        float fAbs2 = Math.abs(e11.getY() - this.f26541h);
                        if (this.f26548o.f26525f) {
                            int i11 = this.f26534a;
                            if (fAbs > i11 || fAbs2 > i11) {
                                if (!Intrinsics.areEqual(this.f26544k, this.f26548o.f26526g)) {
                                    this.f26548o.m30858t();
                                    this.f26548o.f26532m.m96414u(false);
                                    this.f26545l.removeCallbacks(this.f26547n);
                                    return true;
                                }
                                if (!this.f26542i) {
                                    this.f26542i = true;
                                    this.f26545l.removeCallbacks(this.f26547n);
                                    RecyclerView.ViewHolder viewHolder = this.f26544k;
                                    if (viewHolder != null) {
                                        this.f26538e.invoke(viewHolder);
                                    }
                                }
                            }
                        } else if (!this.f26548o.f26524e) {
                            int i12 = this.f26534a;
                            if (fAbs > i12 || fAbs2 > i12) {
                                this.f26542i = true;
                                this.f26545l.removeCallbacks(this.f26547n);
                            }
                        } else {
                            if (fAbs > ((double) fAbs2) * 1.5d) {
                                this.f26545l.removeCallbacks(this.f26547n);
                                return true;
                            }
                            if (fAbs2 > this.f26534a && fAbs2 > fAbs && !this.f26542i) {
                                this.f26542i = true;
                                this.f26545l.removeCallbacks(this.f26547n);
                                RecyclerView.ViewHolder viewHolder2 = this.f26544k;
                                if (viewHolder2 != null) {
                                    this.f26538e.invoke(viewHolder2);
                                }
                            }
                        }
                    }
                }
                this.f26545l.removeCallbacks(this.f26547n);
                boolean z11 = (this.f26548o.f26525f || this.f26548o.f26524e) && (!this.f26542i || this.f26546m);
                if (this.f26548o.f26527h != null) {
                    this.f26539f.invoke();
                } else if (e11.getActionMasked() == 1 && ((this.f26548o.f26525f || this.f26548o.f26524e) && !this.f26542i)) {
                    if (e11.getX() < 0.0f || e11.getY() < 0.0f || e11.getX() > rv2.getWidth() || e11.getY() > rv2.getHeight()) {
                        if (this.f26548o.f26525f) {
                            this.f26548o.m30858t();
                            C43764t.m96397v(this.f26548o.f26532m, false, 1, null);
                        }
                        if (this.f26548o.f26524e) {
                            this.f26548o.m30857s();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("norm_version", "1");
                            Unit unit = Unit.INSTANCE;
                            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "clickBlank", null, jSONObject, 4, null);
                        }
                    } else {
                        RecyclerView.ViewHolder viewHolder3 = this.f26544k;
                        if (viewHolder3 != null) {
                            float fAbs3 = Math.abs(e11.getX() - this.f26540g);
                            float fAbs4 = Math.abs(e11.getY() - this.f26541h);
                            if (!this.f26546m) {
                                int i13 = this.f26534a;
                                if (fAbs3 <= i13 && fAbs4 <= i13) {
                                    this.f26536c.invoke(viewHolder3, Float.valueOf(e11.getX()), Float.valueOf(e11.getY()));
                                }
                            }
                        } else {
                            GridItemTouchHelper<T> gridItemTouchHelper = this.f26548o;
                            if (gridItemTouchHelper.f26525f) {
                                gridItemTouchHelper.m30858t();
                                C43764t.m96397v(gridItemTouchHelper.f26532m, false, 1, null);
                            }
                            if (gridItemTouchHelper.f26524e) {
                                gridItemTouchHelper.m30857s();
                            }
                        }
                    }
                }
                this.f26543j = null;
                this.f26544k = null;
                return z11;
            }
            this.f26540g = e11.getX();
            this.f26541h = e11.getY();
            this.f26542i = false;
            this.f26546m = false;
            View viewFindChildViewUnder = rv2.findChildViewUnder(e11.getX(), e11.getY());
            this.f26543j = viewFindChildViewUnder;
            this.f26544k = viewFindChildViewUnder != null ? rv2.getChildViewHolder(viewFindChildViewUnder) : null;
            this.f26545l.postDelayed(this.f26547n, this.f26535b);
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            if (disallowIntercept) {
                this.f26545l.removeCallbacks(this.f26547n);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NotNull RecyclerView rv2, @NotNull MotionEvent e11) {
            Intrinsics.checkNotNullParameter(rv2, "rv");
            Intrinsics.checkNotNullParameter(e11, "e");
        }

        public /* synthetic */ C15002a(GridItemTouchHelper gridItemTouchHelper, int i11, long j11, Function3 function3, Function1 function1, Function1 function2, Function0 function0, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(gridItemTouchHelper, (i12 & 1) != 0 ? ViewConfiguration.get(BaseApplication.INSTANCE.get()).getScaledTouchSlop() + 5 : i11, (i12 & 2) != 0 ? ViewConfiguration.getLongPressTimeout() : j11, function3, function1, function2, function0);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.container.ui.GridItemTouchHelper$b */
    /* JADX INFO: compiled from: GridItemTouchHelper.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$WidgetActionHandler;", "", "onEnterDragMode", "", "onExitDragMode", "onEnterEditMode", "onExitEditMode", "showCardDetail", "cardData", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "showAddList", "removeCard", ViewProps.POSITION, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC15003b {
        /* JADX INFO: renamed from: k0 */
        void mo30759k0();

        /* JADX INFO: renamed from: r0 */
        void mo30765r0();

        /* JADX INFO: renamed from: s0 */
        void mo30766s0();

        /* JADX INFO: renamed from: t0 */
        void mo30767t0(int i11);

        /* JADX INFO: renamed from: u0 */
        void mo30768u0();

        /* JADX INFO: renamed from: v0 */
        void mo30769v0();

        /* JADX INFO: renamed from: w0 */
        void mo30770w0(@NotNull BaseCardDataV2 baseCardDataV2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isItemViewSwipeEnabled */
    public boolean get_isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isLongPressDragEnabled */
    public boolean get_isLongPressDragEnabled() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m30857s() {
        this.f26524e = false;
        m30847E(false, null);
        C43764t.m96397v(this.f26532m, false, 1, null);
        this.f26522c.mo30759k0();
        m30853P();
    }

    /* JADX INFO: renamed from: w */
    public final void m30861w() throws JSONException {
        m30841p(this, null, 1, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m30863y(RecyclerView.ViewHolder viewHolder) {
        int bindingAdapterPosition;
        if (viewHolder != null) {
            List<T> data = this.f26521b.getData();
            if (data == null || (bindingAdapterPosition = viewHolder.getBindingAdapterPosition()) == -1 || bindingAdapterPosition < 0 || bindingAdapterPosition >= data.size()) {
                return;
            }
            C43767w<T> c43767w = this.f26531l;
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            c43767w.m96427d(itemView, false);
            this.f26522c.mo30767t0(bindingAdapterPosition);
        }
        if (this.f26525f) {
            m30858t();
            C43764t.m96397v(this.f26532m, false, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridItemTouchHelper(@NotNull C43745a<BaseCardDataV2> adapter, @NotNull InterfaceC15003b widgetActionHandler) {
        super(15, 0);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(widgetActionHandler, "widgetActionHandler");
        this.f26521b = adapter;
        this.f26522c = widgetActionHandler;
        this.f26523d = new Handler(Looper.getMainLooper());
        this.f26530k = HomeCardsRepositoryV2.f26494a.m30800r();
        this.f26531l = new C43767w<>();
        this.f26532m = new C43764t();
        this.f26533n = C27040e.m66658b(40);
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m30822I(GridItemTouchHelper gridItemTouchHelper, RecyclerView.ViewHolder holder, float f11, float f12) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        gridItemTouchHelper.m30859u(holder, f11, f12);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m30823J(GridItemTouchHelper gridItemTouchHelper, RecyclerView.ViewHolder holder) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        gridItemTouchHelper.m30862x(holder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m30824K(GridItemTouchHelper gridItemTouchHelper, RecyclerView.ViewHolder holder) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        gridItemTouchHelper.m30860v(holder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m30826O(GridItemTouchHelper gridItemTouchHelper, BaseCardDataV2 oldData, BaseCardDataV2 newData) {
        Intrinsics.checkNotNullParameter(oldData, "oldData");
        Intrinsics.checkNotNullParameter(newData, "newData");
        Function2<? super BaseCardDataV2, ? super BaseCardDataV2, Unit> function2 = gridItemTouchHelper.f26529j;
        if (function2 != null) {
            function2.invoke(oldData, newData);
        }
        gridItemTouchHelper.m30858t();
        gridItemTouchHelper.m30857s();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m30841p(GridItemTouchHelper gridItemTouchHelper, RecyclerView.ViewHolder viewHolder, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            viewHolder = null;
        }
        gridItemTouchHelper.m30855o(viewHolder);
    }

    /* JADX INFO: renamed from: r */
    public static final void m30842r(GridItemTouchHelper gridItemTouchHelper, RecyclerView.ViewHolder viewHolder) throws JSONException {
        if (gridItemTouchHelper.f26525f && Intrinsics.areEqual(gridItemTouchHelper.f26526g, viewHolder)) {
            gridItemTouchHelper.m30855o(viewHolder);
            RecyclerView f96711w = gridItemTouchHelper.f26521b.getF96711w();
            if (f96711w != null) {
                gridItemTouchHelper.f26532m.m96406L(gridItemTouchHelper, f96711w);
            }
            ItemTouchHelper itemTouchHelper = gridItemTouchHelper.f26528i;
            if (itemTouchHelper != null) {
                itemTouchHelper.startDrag(viewHolder);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m30843A() {
        this.f26522c.mo30769v0();
    }

    /* JADX INFO: renamed from: B */
    public final void m30844B() {
        Runnable runnable = this.f26527h;
        if (runnable != null) {
            this.f26523d.removeCallbacks(runnable);
        }
        this.f26527h = null;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m30845C(RecyclerView.ViewHolder viewHolder, float f11, float f12) {
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        int left = itemView.getLeft();
        int top = itemView.getTop();
        int i11 = this.f26533n;
        return f11 < ((float) (left + i11)) && f11 > ((float) left) && f12 < ((float) (i11 + top)) && f12 > ((float) top);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m30846D() throws JSONException {
        if (this.f26525f) {
            m30858t();
            C43764t.m96397v(this.f26532m, false, 1, null);
            return true;
        }
        if (!this.f26524e) {
            return false;
        }
        m30857s();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "clickBlank", null, jSONObject, 4, null);
        return true;
    }

    @UiThread
    /* JADX INFO: renamed from: E */
    public final void m30847E(boolean z11, @Nullable RecyclerView.ViewHolder viewHolder) {
        RecyclerView f96711w;
        List<T> data = this.f26521b.getData();
        if (data == null || (f96711w = this.f26521b.getF96711w()) == null) {
            return;
        }
        if (z11) {
            this.f26531l.m96428f(f96711w, data, viewHolder);
        } else {
            this.f26531l.m96430h(f96711w);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m30848F(@NotNull ItemTouchHelper touchHelper) {
        Intrinsics.checkNotNullParameter(touchHelper, "touchHelper");
        this.f26528i = touchHelper;
    }

    /* JADX INFO: renamed from: G */
    public final void m30849G(@NotNull Function2<? super BaseCardDataV2, ? super BaseCardDataV2, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26529j = listener;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: H */
    public final void m30850H(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.addOnItemTouchListener(new C15002a(this, 0, 0L, new Function3() { // from class: qj.b
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GridItemTouchHelper.m30822I(this.f96719b, (RecyclerView.ViewHolder) obj, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
            }
        }, new Function1() { // from class: qj.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GridItemTouchHelper.m30823J(this.f96720b, (RecyclerView.ViewHolder) obj);
            }
        }, new Function1() { // from class: qj.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GridItemTouchHelper.m30824K(this.f96721b, (RecyclerView.ViewHolder) obj);
            }
        }, new Function0() { // from class: qj.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridItemTouchHelper.m30825L(this.f96722b);
            }
        }, 3, null));
    }

    /* JADX INFO: renamed from: M */
    public final void m30851M(RecyclerView.ViewHolder viewHolder) {
        List<T> data;
        BaseCardDataV2 baseCardDataV2;
        if (viewHolder == null || this.f26521b.getData() == null || (data = this.f26521b.getData()) == null || (baseCardDataV2 = (BaseCardDataV2) CollectionsKt.getOrNull(data, viewHolder.getBindingAdapterPosition())) == null) {
            return;
        }
        this.f26522c.mo30770w0(baseCardDataV2);
    }

    /* JADX INFO: renamed from: N */
    public final void m30852N(View view, BaseCardDataV2 baseCardDataV2) {
        RecyclerView f96711w;
        if (this.f26525f && (f96711w = this.f26521b.getF96711w()) != null) {
            this.f26532m.m96405J(f96711w, view, this, baseCardDataV2, new Function2() { // from class: qj.g
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GridItemTouchHelper.m30826O(this.f96725b, (BaseCardDataV2) obj, (BaseCardDataV2) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m30853P() {
        C12572a.m23695d("com.kubi.home.event.HomeEvent:home_show_home_add_card_dialog", Boolean.FALSE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m30854Q(boolean z11) {
        this.f26530k = z11;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder current, @NotNull RecyclerView.ViewHolder target) {
        BaseCardDataV2 baseCardDataV2;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(target, "target");
        List<T> data = this.f26521b.getData();
        if (data == null) {
            return false;
        }
        int bindingAdapterPosition = current.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
        return bindingAdapterPosition >= 0 && bindingAdapterPosition < data.size() - 1 && bindingAdapterPosition2 >= 0 && bindingAdapterPosition2 < data.size() - 1 && (baseCardDataV2 = (BaseCardDataV2) CollectionsKt.getOrNull(data, bindingAdapterPosition)) != null && baseCardDataV2.getDraggable() && bindingAdapterPosition2 >= this.f26521b.m96367s();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    @Nullable
    public RecyclerView.ViewHolder chooseDropTarget(@NotNull RecyclerView.ViewHolder selected, @NotNull List<RecyclerView.ViewHolder> dropTargets, int curX, int curY) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(dropTargets, "dropTargets");
        View itemView = selected.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        int width = itemView.getWidth() + curX;
        int height = itemView.getHeight() + curY;
        int width2 = (itemView.getWidth() / 2) + curX;
        int height2 = (itemView.getHeight() / 2) + curY;
        RecyclerView.ViewHolder viewHolder = null;
        RecyclerView.ViewHolder viewHolder2 = null;
        for (RecyclerView.ViewHolder viewHolder3 : dropTargets) {
            View itemView2 = viewHolder3.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            int left = itemView2.getLeft() + (itemView2.getWidth() / 2);
            int top = itemView2.getTop() + (itemView2.getHeight() / 2);
            boolean z11 = (width2 < left && width > left) || (width2 > left && curX < left);
            boolean z12 = (curY < viewHolder3.itemView.getTop() && height > viewHolder3.itemView.getTop() && (height2 > viewHolder3.itemView.getTop() || height > top)) || (height > viewHolder3.itemView.getBottom() && curY < viewHolder3.itemView.getBottom() && (height2 < viewHolder3.itemView.getBottom() || curY < top));
            if (z11) {
                if (viewHolder2 == null) {
                    viewHolder2 = viewHolder3;
                } else {
                    View itemView3 = viewHolder2.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    if (Math.abs(width2 - left) < Math.abs(width2 - (itemView3.getLeft() + (itemView3.getWidth() / 2)))) {
                        viewHolder2 = viewHolder3;
                    }
                }
            }
            if (z12) {
                if (viewHolder != null) {
                    View itemView4 = viewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    if (Math.abs(height2 - top) < Math.abs(height2 - (itemView4.getTop() + (itemView4.getHeight() / 2)))) {
                    }
                }
                viewHolder = viewHolder3;
            }
        }
        return viewHolder == null ? viewHolder2 : viewHolder;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) throws JSONException {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        C43766v c43766v = C43766v.f96768a;
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C43766v.m96420b(c43766v, itemView, 1.0f, 0L, null, 12, null);
        C43767w<T> c43767w = this.f26531l;
        View itemView2 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        C43767w.m96423e(c43767w, itemView2, false, 2, null);
        if (this.f26521b.getF96711w() != null) {
            this.f26532m.m96406L(this, recyclerView);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m30855o(RecyclerView.ViewHolder viewHolder) throws JSONException {
        RecyclerView f96711w = this.f26521b.getF96711w();
        if (f96711w != null) {
            this.f26532m.m96406L(this, f96711w);
        }
        m30858t();
        this.f26524e = true;
        m30847E(true, viewHolder);
        this.f26522c.mo30765r0();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "addWidgetpage", null, jSONObject, 4, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v11) throws JSONException {
        Intrinsics.checkNotNullParameter(v11, "v");
        int id2 = v11.getId();
        if (id2 == R$id.remove_widget) {
            m30863y(this.f26526g);
            return;
        }
        if (id2 == R$id.edit_home_widget) {
            m30861w();
        } else if (id2 == R$id.home_card_add) {
            m30843A();
        } else if (id2 == R$id.home_card_ok) {
            m30857s();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder target) {
        BaseCardDataV2 baseCardDataV2;
        BaseCardDataV2 baseCardDataV3;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        List<T> data = this.f26521b.getData();
        if (data == null) {
            return false;
        }
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= data.size() - 1 || bindingAdapterPosition2 < 0 || bindingAdapterPosition2 >= data.size() - 1 || !data.get(bindingAdapterPosition).getDraggable() || bindingAdapterPosition2 < this.f26521b.m96367s()) {
            return false;
        }
        List<T> data2 = this.f26521b.getData();
        String code = null;
        if (Intrinsics.areEqual((data2 == null || (baseCardDataV3 = (BaseCardDataV2) CollectionsKt.lastOrNull((List) data2)) == null) ? null : baseCardDataV3.getCode(), "footer") && bindingAdapterPosition2 == data.size() - 1) {
            return false;
        }
        List<T> data3 = this.f26521b.getData();
        if (data3 != null && (baseCardDataV2 = (BaseCardDataV2) CollectionsKt.lastOrNull((List) data3)) != null) {
            code = baseCardDataV2.getCode();
        }
        if (Intrinsics.areEqual(code, HomeWidgetCode.HomeFeed.getCode()) && bindingAdapterPosition2 == data.size() - 1) {
            return false;
        }
        this.f26521b.m96368t(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    /* JADX INFO: renamed from: q */
    public final void m30856q(final RecyclerView.ViewHolder viewHolder) {
        if (this.f26525f) {
            return;
        }
        this.f26525f = true;
        this.f26526g = viewHolder;
        List<T> data = this.f26521b.getData();
        BaseCardDataV2 baseCardDataV2 = data != null ? (BaseCardDataV2) CollectionsKt.getOrNull(data, viewHolder.getLayoutPosition()) : null;
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        m30852N(itemView, baseCardDataV2);
        Runnable runnable = new Runnable() { // from class: qj.f
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                GridItemTouchHelper.m30842r(this.f96723b, viewHolder);
            }
        };
        this.f26527h = runnable;
        Handler handler = this.f26523d;
        Intrinsics.checkNotNull(runnable);
        handler.postDelayed(runnable, 1200L);
        this.f26522c.mo30768u0();
    }

    /* JADX INFO: renamed from: t */
    public final void m30858t() {
        if (this.f26525f) {
            this.f26525f = false;
            this.f26526g = null;
            this.f26522c.mo30766s0();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m30859u(@NotNull RecyclerView.ViewHolder viewHolder, float f11, float f12) throws JSONException {
        List<T> data;
        RecyclerView.ViewHolder viewHolder2;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (C27014a1.m66502b(viewHolder.itemView, 500L) || (data = this.f26521b.getData()) == null) {
            return;
        }
        BaseCardDataV2 baseCardDataV2 = (BaseCardDataV2) CollectionsKt.getOrNull(data, viewHolder.getBindingAdapterPosition());
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (!this.f26524e) {
            if (this.f26525f) {
                if (!Intrinsics.areEqual(viewHolder, this.f26526g)) {
                    m30858t();
                    C43764t.m96397v(this.f26532m, false, 1, null);
                }
                if (bindingAdapterPosition == -1 || (viewHolder2 = this.f26526g) == null || bindingAdapterPosition != viewHolder2.getBindingAdapterPosition()) {
                    return;
                }
                m30841p(this, null, 1, null);
                return;
            }
            return;
        }
        if (baseCardDataV2 == null || !baseCardDataV2.getDraggable()) {
            m30857s();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "clickBlank", null, jSONObject, 4, null);
            return;
        }
        if (!m30845C(viewHolder, f11, f12)) {
            if (bindingAdapterPosition != -1) {
                m30851M(viewHolder);
            }
        } else {
            m30863y(viewHolder);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("norm_version", "1");
            Unit unit2 = Unit.INSTANCE;
            C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "clickdelete", null, jSONObject2, 4, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m30860v(@NotNull RecyclerView.ViewHolder viewHolder) throws JSONException {
        int bindingAdapterPosition;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        List<T> data = this.f26521b.getData();
        if (data != null && this.f26525f && (bindingAdapterPosition = viewHolder.getBindingAdapterPosition()) != -1 && bindingAdapterPosition >= 0 && bindingAdapterPosition < data.size() && data.get(bindingAdapterPosition).getDraggable() && Intrinsics.areEqual(this.f26526g, viewHolder)) {
            Runnable runnable = this.f26527h;
            if (runnable != null) {
                this.f26523d.removeCallbacks(runnable);
            }
            this.f26527h = null;
            ItemTouchHelper itemTouchHelper = this.f26528i;
            if (itemTouchHelper != null) {
                itemTouchHelper.startDrag(viewHolder);
            }
            m30855o(viewHolder);
            RecyclerView f96711w = this.f26521b.getF96711w();
            if (f96711w != null) {
                this.f26532m.m96406L(this, f96711w);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m30862x(@NotNull RecyclerView.ViewHolder viewHolder) throws JSONException {
        int bindingAdapterPosition;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        List<T> data = this.f26521b.getData();
        if (data != null && (bindingAdapterPosition = viewHolder.getBindingAdapterPosition()) != -1 && bindingAdapterPosition >= 0 && bindingAdapterPosition < data.size() && data.get(bindingAdapterPosition).getDraggable()) {
            if (this.f26524e) {
                ItemTouchHelper itemTouchHelper = this.f26528i;
                if (itemTouchHelper != null) {
                    itemTouchHelper.startDrag(viewHolder);
                    return;
                }
                return;
            }
            if (!this.f26525f || !Intrinsics.areEqual(this.f26526g, viewHolder)) {
                m30856q(viewHolder);
                return;
            }
            ItemTouchHelper itemTouchHelper2 = this.f26528i;
            if (itemTouchHelper2 != null) {
                itemTouchHelper2.startDrag(viewHolder);
            }
            m30855o(viewHolder);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m30864z(@NotNull InnerViewHolder<T> cardViewHolder) {
        Intrinsics.checkNotNullParameter(cardViewHolder, "cardViewHolder");
        this.f26531l.m96426c(cardViewHolder);
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m30825L(GridItemTouchHelper gridItemTouchHelper) {
        gridItemTouchHelper.m30844B();
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        if (actionState == 2 && viewHolder != null) {
            Object systemService = viewHolder.itemView.getContext().getSystemService("vibrator");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService).vibrate(1L);
            C43767w<T> c43767w = this.f26531l;
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            if (c43767w.m96424a(itemView)) {
                C43766v c43766v = C43766v.f96768a;
                View itemView2 = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                C43766v.m96420b(c43766v, itemView2, 1.05f, 0L, null, 12, null);
                C43767w<T> c43767w2 = this.f26531l;
                View itemView3 = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                c43767w2.m96427d(itemView3, false);
                return;
            }
            C43766v c43766v2 = C43766v.f96768a;
            View itemView4 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
            C43766v.m96420b(c43766v2, itemView4, 1.05f, 0L, null, 8, null);
        }
    }
}
