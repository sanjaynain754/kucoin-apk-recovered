package com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorBattleStore;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import wd0.AnchorBattleState;
import wd0.BattleUser;
import wd0.MediaState;

/* JADX INFO: compiled from: BattleMemberInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0014J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0002J\u001c\u0010$\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&H\u0082@¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010)J\u000e\u0010+\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010)J\b\u0010,\u001a\u00020\u0016H\u0002J\b\u0010-\u001a\u00020\u0016H\u0002J\u000e\u0010.\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010)J\u000e\u0010/\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010)R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleMemberInfoView;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rankingImage", "", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "rankingView", "Landroid/widget/ImageView;", "scoreView", "Landroid/widget/TextView;", "connectionStatusView", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "userId", "", "init", "", "liveStreamManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "initView", "refreshView", "addObserver", "removeObserver", "setData", "user", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/BattleUser;", "reset", "showBattleView", TIMPushProvider.f75062n, "", "handleBattleUserChange", "battleUsers", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onConnectedListChange", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBattleScoreChanged", "onBattleStartChange", "onBattleStart", "onBattleEnd", "onBattleResultDisplay", "onPipModeObserver", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nBattleMemberInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleMemberInfoView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleMemberInfoView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n1208#2,2:216\n1236#2,4:218\n1208#2,2:222\n1236#2,4:224\n*S KotlinDebug\n*F\n+ 1 BattleMemberInfoView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleMemberInfoView\n*L\n119#1:216,2\n119#1:218,4\n176#1:222,2\n176#1:224,4\n*E\n"})
public final class BattleMemberInfoView extends BasicView {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final int[] f78238n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final LiveKitLogger f78239o;

    /* JADX INFO: renamed from: p */
    public ImageView f78240p;

    /* JADX INFO: renamed from: q */
    public TextView f78241q;

    /* JADX INFO: renamed from: r */
    public TextView f78242r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public InterfaceC41775x1 f78243s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public String f78244t;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleMemberInfoView$a */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36082a<T> implements InterfaceC41635f {
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                BattleMemberInfoView.this.m80334y();
            }
            return Unit.INSTANCE;
        }

        public C36082a() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleMemberInfoView$b */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36088b<T> implements InterfaceC41635f {
        public C36088b() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<BattleUser> list, Continuation<? super Unit> continuation) {
            Object objM80332p = BattleMemberInfoView.this.m80332p(list, continuation);
            return objM80332p == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM80332p : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleMemberInfoView$c */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36089c<T> implements InterfaceC41635f {
        public C36089c() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            if (bool != null) {
                BattleMemberInfoView battleMemberInfoView = BattleMemberInfoView.this;
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    battleMemberInfoView.m80328u();
                } else {
                    if (!Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                        throw new NoWhenBranchMatchedException();
                    }
                    battleMemberInfoView.m80325r();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleMemberInfoView$d */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36090d<T> implements InterfaceC41635f {
        public C36090d() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            List<BattleUser> listEmptyList;
            InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
            BattleMemberInfoView battleMemberInfoView = BattleMemberInfoView.this;
            AnchorBattleState f78200e = battleMemberInfoView.getF78200e();
            if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null || (listEmptyList = interfaceC41678wM101126b.getValue()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Object objM80332p = battleMemberInfoView.m80332p(listEmptyList, continuation);
            return objM80332p == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM80332p : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.widgets.BattleMemberInfoView$e */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36091e<T> implements InterfaceC41635f {
        public C36091e() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m80340a(boolean z11, Continuation<? super Unit> continuation) {
            InterfaceC41678w<Boolean> interfaceC41678wM101129e;
            if (z11) {
                BattleMemberInfoView.this.setVisibility(8);
            } else {
                AnchorBattleState f78200e = BattleMemberInfoView.this.getF78200e();
                if ((f78200e == null || (interfaceC41678wM101129e = f78200e.m101129e()) == null) ? false : Intrinsics.areEqual(interfaceC41678wM101129e.getValue(), Boxing.boxBoolean(true))) {
                    BattleMemberInfoView.this.setVisibility(0);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m80340a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BattleMemberInfoView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: z */
    public final void m80335z(boolean z11) {
        setVisibility(0);
        ImageView imageView = this.f78240p;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankingView");
            imageView = null;
        }
        imageView.setVisibility(z11 ? 0 : 8);
        TextView textView2 = this.f78241q;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scoreView");
            textView2 = null;
        }
        textView2.setVisibility(z11 ? 0 : 8);
        TextView textView3 = this.f78242r;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionStatusView");
        } else {
            textView = textView3;
        }
        textView.setVisibility(z11 ? 8 : 0);
    }

    public /* synthetic */ BattleMemberInfoView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m80325r() {
        Map mapEmptyMap;
        InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
        List<BattleUser> value;
        List<SeatUserInfo> value2 = CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoHostState().getConnected().getValue();
        if (value2.isEmpty()) {
            return;
        }
        AnchorBattleState f78200e = getF78200e();
        if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null || (value = interfaceC41678wM101126b.getValue()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        } else {
            mapEmptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(value, 10)), 16));
            for (Object obj : value) {
                mapEmptyMap.put(((BattleUser) obj).getUserId(), obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (value2.size() == 2) {
            Iterator<SeatUserInfo> it = value2.iterator();
            while (it.hasNext()) {
                BattleUser battleUser = (BattleUser) mapEmptyMap.get(it.next().getUserID());
                if (battleUser != null) {
                    linkedHashMap.put(battleUser.getUserId(), battleUser);
                }
            }
        }
        boolean z11 = linkedHashMap.size() == 2;
        this.f78239o.m79404b("onBattleEnd isSingleBattle: " + z11);
        if (z11) {
            return;
        }
        setData((BattleUser) mapEmptyMap.get(this.f78244t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m80326s(Continuation<? super Unit> continuation) {
        BattleMemberInfoView$onBattleResultDisplay$1 battleMemberInfoView$onBattleResultDisplay$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101131g;
        if (continuation instanceof BattleMemberInfoView$onBattleResultDisplay$1) {
            battleMemberInfoView$onBattleResultDisplay$1 = (BattleMemberInfoView$onBattleResultDisplay$1) continuation;
            int i11 = battleMemberInfoView$onBattleResultDisplay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleMemberInfoView$onBattleResultDisplay$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleMemberInfoView$onBattleResultDisplay$1 = new BattleMemberInfoView$onBattleResultDisplay$1(this, continuation);
            }
        } else {
            battleMemberInfoView$onBattleResultDisplay$1 = new BattleMemberInfoView$onBattleResultDisplay$1(this, continuation);
        }
        Object obj = battleMemberInfoView$onBattleResultDisplay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleMemberInfoView$onBattleResultDisplay$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101131g = f78200e.m101131g()) == null) {
                return Unit.INSTANCE;
            }
            C36082a c36082a = new C36082a();
            battleMemberInfoView$onBattleResultDisplay$1.label = 1;
            if (interfaceC41678wM101131g.collect(c36082a, battleMemberInfoView$onBattleResultDisplay$1) == coroutine_suspended) {
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
    /* JADX INFO: renamed from: t */
    public final Object m80327t(Continuation<? super Unit> continuation) {
        BattleMemberInfoView$onBattleScoreChanged$1 battleMemberInfoView$onBattleScoreChanged$1;
        InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
        if (continuation instanceof BattleMemberInfoView$onBattleScoreChanged$1) {
            battleMemberInfoView$onBattleScoreChanged$1 = (BattleMemberInfoView$onBattleScoreChanged$1) continuation;
            int i11 = battleMemberInfoView$onBattleScoreChanged$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleMemberInfoView$onBattleScoreChanged$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleMemberInfoView$onBattleScoreChanged$1 = new BattleMemberInfoView$onBattleScoreChanged$1(this, continuation);
            }
        } else {
            battleMemberInfoView$onBattleScoreChanged$1 = new BattleMemberInfoView$onBattleScoreChanged$1(this, continuation);
        }
        Object obj = battleMemberInfoView$onBattleScoreChanged$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleMemberInfoView$onBattleScoreChanged$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null) {
                return Unit.INSTANCE;
            }
            C36088b c36088b = new C36088b();
            battleMemberInfoView$onBattleScoreChanged$1.label = 1;
            if (interfaceC41678wM101126b.collect(c36088b, battleMemberInfoView$onBattleScoreChanged$1) == coroutine_suspended) {
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
    /* JADX INFO: renamed from: v */
    public final Object m80329v(Continuation<? super Unit> continuation) {
        BattleMemberInfoView$onBattleStartChange$1 battleMemberInfoView$onBattleStartChange$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101129e;
        if (continuation instanceof BattleMemberInfoView$onBattleStartChange$1) {
            battleMemberInfoView$onBattleStartChange$1 = (BattleMemberInfoView$onBattleStartChange$1) continuation;
            int i11 = battleMemberInfoView$onBattleStartChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleMemberInfoView$onBattleStartChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleMemberInfoView$onBattleStartChange$1 = new BattleMemberInfoView$onBattleStartChange$1(this, continuation);
            }
        } else {
            battleMemberInfoView$onBattleStartChange$1 = new BattleMemberInfoView$onBattleStartChange$1(this, continuation);
        }
        Object obj = battleMemberInfoView$onBattleStartChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleMemberInfoView$onBattleStartChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101129e = f78200e.m101129e()) == null) {
                return Unit.INSTANCE;
            }
            C36089c c36089c = new C36089c();
            battleMemberInfoView$onBattleStartChange$1.label = 1;
            if (interfaceC41678wM101129e.collect(c36089c, battleMemberInfoView$onBattleStartChange$1) == coroutine_suspended) {
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
    /* JADX INFO: renamed from: w */
    public final Object m80330w(Continuation<? super Unit> continuation) {
        BattleMemberInfoView$onConnectedListChange$1 battleMemberInfoView$onConnectedListChange$1;
        if (continuation instanceof BattleMemberInfoView$onConnectedListChange$1) {
            battleMemberInfoView$onConnectedListChange$1 = (BattleMemberInfoView$onConnectedListChange$1) continuation;
            int i11 = battleMemberInfoView$onConnectedListChange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleMemberInfoView$onConnectedListChange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleMemberInfoView$onConnectedListChange$1 = new BattleMemberInfoView$onConnectedListChange$1(this, continuation);
            }
        } else {
            battleMemberInfoView$onConnectedListChange$1 = new BattleMemberInfoView$onConnectedListChange$1(this, continuation);
        }
        Object obj = battleMemberInfoView$onConnectedListChange$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleMemberInfoView$onConnectedListChange$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatUserInfo>> connected = CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoHostState().getConnected();
            C36090d c36090d = new C36090d();
            battleMemberInfoView$onConnectedListChange$1.label = 1;
            if (connected.collect(c36090d, battleMemberInfoView$onConnectedListChange$1) == coroutine_suspended) {
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
    /* JADX INFO: renamed from: x */
    public final Object m80331x(Continuation<? super Unit> continuation) {
        BattleMemberInfoView$onPipModeObserver$1 battleMemberInfoView$onPipModeObserver$1;
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        if (continuation instanceof BattleMemberInfoView$onPipModeObserver$1) {
            battleMemberInfoView$onPipModeObserver$1 = (BattleMemberInfoView$onPipModeObserver$1) continuation;
            int i11 = battleMemberInfoView$onPipModeObserver$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                battleMemberInfoView$onPipModeObserver$1.label = i11 - Integer.MIN_VALUE;
            } else {
                battleMemberInfoView$onPipModeObserver$1 = new BattleMemberInfoView$onPipModeObserver$1(this, continuation);
            }
        } else {
            battleMemberInfoView$onPipModeObserver$1 = new BattleMemberInfoView$onPipModeObserver$1(this, continuation);
        }
        Object obj = battleMemberInfoView$onPipModeObserver$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = battleMemberInfoView$onPipModeObserver$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            MediaState f78202g = getF78202g();
            if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null) {
                return Unit.INSTANCE;
            }
            C36091e c36091e = new C36091e();
            battleMemberInfoView$onPipModeObserver$1.label = 1;
            if (interfaceC41678wM101183c.collect(c36091e, battleMemberInfoView$onPipModeObserver$1) == coroutine_suspended) {
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

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80120e() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78243s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final Object m80332p(List<BattleUser> list, Continuation<? super Unit> continuation) {
        Map mapEmptyMap;
        InterfaceC41678w<List<BattleUser>> interfaceC41678wM101126b;
        List<BattleUser> value;
        List<SeatUserInfo> value2 = CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoHostState().getConnected().getValue();
        if (list.isEmpty() || value2.isEmpty()) {
            AnchorBattleStore f78205j = getF78205j();
            if (f78205j != null) {
                f78205j.m80214z();
            }
        } else {
            AnchorBattleState f78200e = getF78200e();
            if (f78200e == null || (interfaceC41678wM101126b = f78200e.m101126b()) == null || (value = interfaceC41678wM101126b.getValue()) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            } else {
                mapEmptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(value, 10)), 16));
                for (Object obj : value) {
                    mapEmptyMap.put(((BattleUser) obj).getUserId(), obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (value2.size() == 2) {
                Iterator<SeatUserInfo> it = value2.iterator();
                while (it.hasNext()) {
                    BattleUser battleUser = (BattleUser) mapEmptyMap.get(it.next().getUserID());
                    if (battleUser != null) {
                        linkedHashMap.put(battleUser.getUserId(), battleUser);
                    }
                }
            }
            boolean z11 = linkedHashMap.size() == 2;
            this.f78239o.m79404b("onBattleChanged isSingleBattle: " + z11);
            if (z11) {
                m80334y();
            } else {
                setData((BattleUser) mapEmptyMap.get(this.f78244t));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final void m80333q(@NotNull AnchorStore liveStreamManager, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(liveStreamManager, "liveStreamManager");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f78244t = userId;
        m80259b(liveStreamManager);
    }

    /* JADX INFO: renamed from: y */
    public final void m80334y() {
        setVisibility(8);
        ImageView imageView = this.f78240p;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankingView");
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView2 = this.f78241q;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scoreView");
            textView2 = null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f78242r;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionStatusView");
        } else {
            textView = textView3;
        }
        textView.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BattleMemberInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78238n = new int[]{R$drawable.livekit_battle_ranking_1, R$drawable.livekit_battle_ranking_2, R$drawable.livekit_battle_ranking_3, R$drawable.livekit_battle_ranking_4, R$drawable.livekit_battle_ranking_5, R$drawable.livekit_battle_ranking_6, R$drawable.livekit_battle_ranking_7, R$drawable.livekit_battle_ranking_8, R$drawable.livekit_battle_ranking_9};
        this.f78239o = LiveKitLogger.f77564c.getFeaturesLogger("BattleMemberInfoView");
    }

    private final void setData(BattleUser battleUser) {
        InterfaceC41678w<Boolean> interfaceC41678wM101183c;
        MediaState f78202g = getF78202g();
        if (f78202g == null || (interfaceC41678wM101183c = f78202g.m101183c()) == null || !interfaceC41678wM101183c.getValue().booleanValue()) {
            setVisibility(0);
        }
        if (battleUser == null) {
            m80335z(false);
            return;
        }
        m80335z(true);
        TextView textView = this.f78241q;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scoreView");
            textView = null;
        }
        textView.setText(String.valueOf(battleUser.getScore()));
        if (battleUser.getRanking() > 0 && battleUser.getRanking() <= this.f78238n.length) {
            ImageView imageView2 = this.f78240p;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rankingView");
            } else {
                imageView = imageView2;
            }
            imageView.setImageResource(this.f78238n[battleUser.getRanking() - 1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m80328u() {
        m80334y();
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80110a() {
        this.f78243s = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new BattleMemberInfoView$addObserver$1(this, null), 3, null);
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80115c() {
        View.inflate(getContext(), R$layout.livekit_battle_member_info_view, this);
        View viewFindViewById = findViewById(R$id.iv_ranking);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78240p = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_score);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78241q = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_connection_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78242r = (TextView) viewFindViewById3;
        m80334y();
    }

    @Override // com.trtc.uikit.livekit.features.anchorboardcast.view.BasicView
    /* JADX INFO: renamed from: d */
    public void mo80117d() {
    }
}
