package com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorBattleStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;
import wd0.AnchorBattleState;
import wd0.BattleUser;
import wd0.MediaState;

/* JADX INFO: compiled from: BattleInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u000e\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dJ\b\u0010*\u001a\u00020\u0016H\u0002J\u000e\u0010+\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001c\u001a\u00020\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020 0-H\u0002J\u000e\u0010.\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dJ\u000e\u0010/\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "isRtl", "", "singleBattleScoreView", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/SingleBattleScoreView;", "battleTimeView", "Landroid/widget/TextView;", "battleStartView", "Landroid/widget/ImageView;", "battleResultView", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "initView", "", "refreshView", "addObserver", "removeObserver", "onBattleStart", "onBattleEnd", "onBattleScoreChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "inviter", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/BattleUser;", "invitee", "showBattleResult", "type", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;", "onDurationCountDown", "updateTime", "time", "", "onResultDisplay", "stopDisplayBattleResult", "onConnectedListChange", "battleUsers", "", "onBattleStartChange", "onPipModeObserver", "BattleResultType", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class BattleInfoView extends BasicView {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveKitLogger f78223n;

    /* JADX INFO: renamed from: o */
    public final boolean f78224o;

    /* JADX INFO: renamed from: p */
    public SingleBattleScoreView f78225p;

    /* JADX INFO: renamed from: q */
    public TextView f78226q;

    /* JADX INFO: renamed from: r */
    public ImageView f78227r;

    /* JADX INFO: renamed from: s */
    public ImageView f78228s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public InterfaceC41775x1 f78229t;

    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;", "", "<init>", "(Ljava/lang/String;I)V", "DRAW", "VICTORY", "DEFEAT", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum BattleResultType {
        DRAW,
        VICTORY,
        DEFEAT;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f78231c = EnumEntriesKt.enumEntries(m80306a());

        @NotNull
        public static EnumEntries<BattleResultType> getEntries() {
            return f78231c;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView$b */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBattleInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleInfoView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$onBattleScoreChanged$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n1208#2,2:236\n1236#2,4:238\n*S KotlinDebug\n*F\n+ 1 BattleInfoView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$onBattleScoreChanged$2\n*L\n94#1:236,2\n94#1:238,4\n*E\n"})
    public static final class C36076b<T> implements InterfaceC41635f {
        public C36076b() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<BattleUser> list, Continuation<? super Unit> continuation) {
            InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
            List<BattleUser> value;
            AnchorBattleState f78200e = BattleInfoView.this.getF78200e();
            if (f78200e != null && (interfaceC41678wM101126b = f78200e.m101126b()) != null && (value = interfaceC41678wM101126b.getValue()) != null) {
                BattleInfoView battleInfoView = BattleInfoView.this;
                if (!value.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(value, 10)), 16));
                    for (T t11 : value) {
                        linkedHashMap.put(((BattleUser) t11).getUserId(), t11);
                    }
                    List<SeatUserInfo> value2 = CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoHostState().getConnected().getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    if (value2.size() == 2) {
                        Iterator<SeatUserInfo> it = value2.iterator();
                        while (it.hasNext()) {
                            BattleUser battleUser = (BattleUser) linkedHashMap.get(it.next().getUserID());
                            if (battleUser != null) {
                                linkedHashMap2.put(battleUser.getUserId(), battleUser);
                            }
                        }
                    }
                    if (linkedHashMap2.size() == 2) {
                        List list2 = CollectionsKt.toList(linkedHashMap2.values());
                        if (((BattleUser) list2.get(0)).getRect().left < ((BattleUser) list2.get(1)).getRect().left) {
                            battleInfoView.m80301J((BattleUser) list2.get(0), (BattleUser) list2.get(1));
                        } else {
                            battleInfoView.m80301J((BattleUser) list2.get(1), (BattleUser) list2.get(0));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView$c */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36077c<T> implements InterfaceC41635f {
        public C36077c() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            BattleInfoView.this.f78223n.m79404b("onBattleStartChange: " + bool);
            if (bool != null) {
                BattleInfoView battleInfoView = BattleInfoView.this;
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    battleInfoView.m80295A();
                } else {
                    if (!Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                        throw new NoWhenBranchMatchedException();
                    }
                    battleInfoView.m80303x();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView$d */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36078d<T> implements InterfaceC41635f {
        public C36078d() {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0064  */
        /* JADX WARN: Code duplicated, block: B:28:0x006c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0070  */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            List<BattleUser> listEmptyList;
            SingleBattleScoreView singleBattleScoreView;
            InterfaceC41678w<Boolean> interfaceC41678wM101129e;
            InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
            BattleInfoView battleInfoView = BattleInfoView.this;
            AnchorBattleState f78200e = battleInfoView.getF78200e();
            if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null || (listEmptyList = interfaceC41678wM101126b.getValue()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            battleInfoView.m80305z(listEmptyList);
            if (list.size() <= 1) {
                BattleInfoView.this.m80300I();
            } else {
                SingleBattleScoreView singleBattleScoreView2 = null;
                if (list.size() != 2) {
                    singleBattleScoreView = BattleInfoView.this.f78225p;
                    if (singleBattleScoreView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("singleBattleScoreView");
                    } else {
                        singleBattleScoreView2 = singleBattleScoreView;
                    }
                    singleBattleScoreView2.setVisibility(8);
                } else {
                    AnchorBattleState f78200e2 = BattleInfoView.this.getF78200e();
                    if ((f78200e2 == null || (interfaceC41678wM101129e = f78200e2.m101129e()) == null) ? false : Intrinsics.areEqual(interfaceC41678wM101129e.getValue(), Boxing.boxBoolean(true))) {
                        SingleBattleScoreView singleBattleScoreView3 = BattleInfoView.this.f78225p;
                        if (singleBattleScoreView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("singleBattleScoreView");
                        } else {
                            singleBattleScoreView2 = singleBattleScoreView3;
                        }
                        singleBattleScoreView2.setVisibility(0);
                    } else {
                        singleBattleScoreView = BattleInfoView.this.f78225p;
                        if (singleBattleScoreView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("singleBattleScoreView");
                        } else {
                            singleBattleScoreView2 = singleBattleScoreView;
                        }
                        singleBattleScoreView2.setVisibility(8);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView$e */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36079e<T> implements InterfaceC41635f {
        /* JADX INFO: renamed from: f */
        public static final void m80311f(BattleInfoView battleInfoView, int i11) {
            battleInfoView.m80302K(i11);
        }

        public C36079e() {
        }

        /* JADX INFO: renamed from: c */
        public final Object m80312c(final int i11, Continuation<? super Unit> continuation) {
            final BattleInfoView battleInfoView = BattleInfoView.this;
            battleInfoView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.b
                @Override // java.lang.Runnable
                public final void run() {
                    BattleInfoView.C36079e.m80311f(battleInfoView, i11);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80312c(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView$f */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36080f<T> implements InterfaceC41635f {
        public C36080f() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80313a(boolean z11, Continuation<? super Unit> continuation) {
            InterfaceC41678w<Boolean> interfaceC41678wM101129e;
            if (z11) {
                BattleInfoView.this.setVisibility(8);
            } else {
                AnchorBattleState f78200e = BattleInfoView.this.getF78200e();
                if ((f78200e == null || (interfaceC41678wM101129e = f78200e.m101129e()) == null) ? false : Intrinsics.areEqual(interfaceC41678wM101129e.getValue(), Boxing.boxBoolean(true))) {
                    BattleInfoView.this.setVisibility(0);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80313a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView$g */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36081g<T> implements InterfaceC41635f {
        public C36081g() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
            List<BattleUser> value;
            BattleInfoView.this.f78223n.m79404b("onResultDisplay: " + bool);
            if (bool != null) {
                BattleInfoView battleInfoView = BattleInfoView.this;
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    String userID = LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveOwner().getUserID();
                    AnchorBattleState f78200e = battleInfoView.getF78200e();
                    if (f78200e != null && (interfaceC41678wM101126b = f78200e.m101126b()) != null && (value = interfaceC41678wM101126b.getValue()) != null) {
                        for (BattleUser battleUser : value) {
                            if (Intrinsics.areEqual(battleUser.getUserId(), userID)) {
                                AnchorBattleStore f78205j = battleInfoView.getF78205j();
                                battleInfoView.m80299H((f78205j == null || !f78205j.m80198h()) ? battleUser.getRanking() == 1 ? BattleResultType.VICTORY : BattleResultType.DEFEAT : BattleResultType.DRAW);
                                break;
                            }
                        }
                    }
                } else {
                    if (!Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                        throw new NoWhenBranchMatchedException();
                    }
                    battleInfoView.m80300I();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BattleInfoView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleInfoView$a */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C36069a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BattleResultType.values().length];
            try {
                iArr[BattleResultType.VICTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleResultType.DEFEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BattleResultType.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BattleInfoView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: B */
    public static final void m80274B(BattleInfoView battleInfoView) {
        ImageView imageView = battleInfoView.f78227r;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleStartView");
            imageView = null;
        }
        imageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public final Object m80275C(Continuation<? super Unit> continuation) {
        BattleInfoView$onBattleStartChange$1 battleInfoView$onBattleStartChange$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101129e;
        if (continuation instanceof BattleInfoView$onBattleStartChange$1) {
            battleInfoView$onBattleStartChange$1 = (BattleInfoView$onBattleStartChange$1) continuation;
            int i11 = battleInfoView$onBattleStartChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleInfoView$onBattleStartChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleInfoView$onBattleStartChange$1 = new BattleInfoView$onBattleStartChange$1(this, continuation);
            }
        } else {
            battleInfoView$onBattleStartChange$1 = new BattleInfoView$onBattleStartChange$1(this, continuation);
        }
        Object obj = battleInfoView$onBattleStartChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleInfoView$onBattleStartChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101129e = f78200e.m101129e()) == null) {
                return Unit.INSTANCE;
            }
            C36077c c36077c = new C36077c();
            battleInfoView$onBattleStartChange$1.label = 1;
            if (interfaceC41678wM101129e.collect(c36077c, battleInfoView$onBattleStartChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m80276F(Continuation<? super Unit> continuation) {
        BattleInfoView$onPipModeObserver$1 battleInfoView$onPipModeObserver$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        if (continuation instanceof BattleInfoView$onPipModeObserver$1) {
            battleInfoView$onPipModeObserver$1 = (BattleInfoView$onPipModeObserver$1) continuation;
            int i11 = battleInfoView$onPipModeObserver$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleInfoView$onPipModeObserver$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleInfoView$onPipModeObserver$1 = new BattleInfoView$onPipModeObserver$1(this, continuation);
            }
        } else {
            battleInfoView$onPipModeObserver$1 = new BattleInfoView$onPipModeObserver$1(this, continuation);
        }
        Object obj = battleInfoView$onPipModeObserver$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleInfoView$onPipModeObserver$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            MediaState f78202g = getF78202g();
            if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null) {
                return Unit.INSTANCE;
            }
            C36080f c36080f = new C36080f();
            battleInfoView$onPipModeObserver$1.label = 1;
            if (interfaceC41678wM101183c.collect(c36080f, battleInfoView$onPipModeObserver$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: A */
    public final void m80295A() {
        SingleBattleScoreView singleBattleScoreView = this.f78225p;
        ImageView imageView = null;
        if (singleBattleScoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("singleBattleScoreView");
            singleBattleScoreView = null;
        }
        singleBattleScoreView.setVisibility(8);
        setVisibility(0);
        ImageView imageView2 = this.f78227r;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleStartView");
        } else {
            imageView = imageView2;
        }
        imageView.setVisibility(0);
        postDelayed(new Runnable() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.a
            @Override // java.lang.Runnable
            public final void run() {
                BattleInfoView.m80274B(this.f78254b);
            }
        }, 1000L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    public final Object m80296D(Continuation<? super Unit> continuation) {
        BattleInfoView$onConnectedListChange$1 battleInfoView$onConnectedListChange$1;
        if (continuation instanceof BattleInfoView$onConnectedListChange$1) {
            battleInfoView$onConnectedListChange$1 = (BattleInfoView$onConnectedListChange$1) continuation;
            int i11 = battleInfoView$onConnectedListChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleInfoView$onConnectedListChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleInfoView$onConnectedListChange$1 = new BattleInfoView$onConnectedListChange$1(this, continuation);
            }
        } else {
            battleInfoView$onConnectedListChange$1 = new BattleInfoView$onConnectedListChange$1(this, continuation);
        }
        Object obj = battleInfoView$onConnectedListChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleInfoView$onConnectedListChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatUserInfo>> connected = CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoHostState().getConnected();
            C36078d c36078d = new C36078d();
            battleInfoView$onConnectedListChange$1.label = 1;
            if (connected.collect(c36078d, battleInfoView$onConnectedListChange$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public final Object m80297E(Continuation<? super Unit> continuation) {
        BattleInfoView$onDurationCountDown$1 battleInfoView$onDurationCountDown$1;
        InterfaceC41678w<Integer> interfaceC41678wM101127c;
        if (continuation instanceof BattleInfoView$onDurationCountDown$1) {
            battleInfoView$onDurationCountDown$1 = (BattleInfoView$onDurationCountDown$1) continuation;
            int i11 = battleInfoView$onDurationCountDown$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleInfoView$onDurationCountDown$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleInfoView$onDurationCountDown$1 = new BattleInfoView$onDurationCountDown$1(this, continuation);
            }
        } else {
            battleInfoView$onDurationCountDown$1 = new BattleInfoView$onDurationCountDown$1(this, continuation);
        }
        Object obj = battleInfoView$onDurationCountDown$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleInfoView$onDurationCountDown$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101127c = f78200e.m101127c()) == null) {
                return Unit.INSTANCE;
            }
            C36079e c36079e = new C36079e();
            battleInfoView$onDurationCountDown$1.label = 1;
            if (interfaceC41678wM101127c.collect(c36079e, battleInfoView$onDurationCountDown$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m80298G(Continuation<? super Unit> continuation) {
        BattleInfoView$onResultDisplay$1 battleInfoView$onResultDisplay$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101131g;
        if (continuation instanceof BattleInfoView$onResultDisplay$1) {
            battleInfoView$onResultDisplay$1 = (BattleInfoView$onResultDisplay$1) continuation;
            int i11 = battleInfoView$onResultDisplay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleInfoView$onResultDisplay$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleInfoView$onResultDisplay$1 = new BattleInfoView$onResultDisplay$1(this, continuation);
            }
        } else {
            battleInfoView$onResultDisplay$1 = new BattleInfoView$onResultDisplay$1(this, continuation);
        }
        Object obj = battleInfoView$onResultDisplay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleInfoView$onResultDisplay$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101131g = f78200e.m101131g()) == null) {
                return Unit.INSTANCE;
            }
            C36081g c36081g = new C36081g();
            battleInfoView$onResultDisplay$1.label = 1;
            if (interfaceC41678wM101131g.collect(c36081g, battleInfoView$onResultDisplay$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: H */
    public final void m80299H(BattleResultType battleResultType) {
        int i11;
        ImageView imageView = this.f78228s;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleResultView");
            imageView = null;
        }
        imageView.setVisibility(0);
        int i12 = C36069a.$EnumSwitchMapping$0[battleResultType.ordinal()];
        if (i12 == 1) {
            i11 = R$drawable.livekit_battle_result_victory;
        } else if (i12 == 2) {
            i11 = R$drawable.livekit_battle_result_defeat;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = R$drawable.livekit_battle_result_draw;
        }
        ImageView imageView3 = this.f78228s;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleResultView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setImageResource(i11);
    }

    /* JADX INFO: renamed from: I */
    public final void m80300I() {
        m80302K(0L);
        setVisibility(8);
        ImageView imageView = this.f78227r;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleStartView");
            imageView = null;
        }
        imageView.setVisibility(8);
        ImageView imageView3 = this.f78228s;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleResultView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(8);
    }

    /* JADX INFO: renamed from: J */
    public final void m80301J(BattleUser battleUser, BattleUser battleUser2) {
        SingleBattleScoreView singleBattleScoreView = this.f78225p;
        SingleBattleScoreView singleBattleScoreView2 = null;
        if (singleBattleScoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("singleBattleScoreView");
            singleBattleScoreView = null;
        }
        singleBattleScoreView.setVisibility(0);
        SingleBattleScoreView singleBattleScoreView3 = this.f78225p;
        if (singleBattleScoreView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("singleBattleScoreView");
        } else {
            singleBattleScoreView2 = singleBattleScoreView3;
        }
        singleBattleScoreView2.m80342b(battleUser.getScore(), battleUser2.getScore());
    }

    /* JADX INFO: renamed from: K */
    public final void m80302K(long j11) {
        String str;
        long j12 = 60;
        long j13 = j11 / j12;
        long j14 = j11 % j12;
        TextView textView = this.f78226q;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleTimeView");
            textView = null;
        }
        if (this.f78224o) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j13)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j13), Long.valueOf(j14)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        textView.setText(str);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80120e() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78229t;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m80304y(Continuation<? super Unit> continuation) {
        BattleInfoView$onBattleScoreChanged$1 battleInfoView$onBattleScoreChanged$1;
        InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
        if (continuation instanceof BattleInfoView$onBattleScoreChanged$1) {
            battleInfoView$onBattleScoreChanged$1 = (BattleInfoView$onBattleScoreChanged$1) continuation;
            int i11 = battleInfoView$onBattleScoreChanged$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleInfoView$onBattleScoreChanged$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleInfoView$onBattleScoreChanged$1 = new BattleInfoView$onBattleScoreChanged$1(this, continuation);
            }
        } else {
            battleInfoView$onBattleScoreChanged$1 = new BattleInfoView$onBattleScoreChanged$1(this, continuation);
        }
        Object obj = battleInfoView$onBattleScoreChanged$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleInfoView$onBattleScoreChanged$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null) {
                return Unit.INSTANCE;
            }
            C36076b c36076b = new C36076b();
            battleInfoView$onBattleScoreChanged$1.label = 1;
            if (interfaceC41678wM101126b.collect(c36076b, battleInfoView$onBattleScoreChanged$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: z */
    public final void m80305z(List<BattleUser> list) {
        List<BattleUser> arrayList;
        InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
        List<SeatUserInfo> value = CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoHostState().getConnected().getValue();
        if (list.isEmpty() || value.isEmpty()) {
            AnchorBattleStore f78205j = getF78205j();
            if (f78205j != null) {
                f78205j.m80214z();
                return;
            }
            return;
        }
        AnchorBattleStore f78205j2 = getF78205j();
        if (f78205j2 != null) {
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null || (arrayList = interfaceC41678wM101126b.getValue()) == null) {
                arrayList = new ArrayList<>();
            }
            f78205j2.m80194C(arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BattleInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78223n = LiveKitLogger.f77564c.getFeaturesLogger("BattleInfoView");
        this.f78224o = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80110a() {
        this.f78229t = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new BattleInfoView$addObserver$1(this, null), 3, null);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80115c() {
        View.inflate(getContext(), R$layout.livekit_battle_info_view, this);
        View viewFindViewById = findViewById(R$id.tv_battle_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78226q = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_battle_start);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78227r = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_battle_result);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78228s = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.single_battle_score_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78225p = (SingleBattleScoreView) viewFindViewById4;
        setVisibility(8);
    }

    /* JADX INFO: renamed from: x */
    public final void m80303x() {
        boolean zAreEqual;
        InterfaceC41678w<Boolean> interfaceC41678wM101129e;
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        MediaState f78202g = getF78202g();
        if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null || !interfaceC41678wM101183c.getValue().booleanValue()) {
            AnchorBattleState f78200e = getF78200e();
            if (f78200e != null && (interfaceC41678wM101129e = f78200e.m101129e()) != null) {
                zAreEqual = Intrinsics.areEqual(interfaceC41678wM101129e.getValue(), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                setVisibility(0);
            }
        }
        TextView textView = this.f78226q;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleTimeView");
            textView = null;
        }
        textView.setText(getF78197b().getString(R$string.common_battle_pk_end));
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80117d() {
    }
}
