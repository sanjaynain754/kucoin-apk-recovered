package com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView;
import ee0.C37144f;
import io.trtc.tuikit.atomicxcore.api.live.BattleEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BattleMemberInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0010\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u0017\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010%R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006)"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "userId", "", "rankingView", "Landroid/widget/ImageView;", "scoreView", "Landroid/widget/TextView;", "connectionStatusView", "battleListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView$battleListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView$battleListener$1;", "init", "", "store", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "initView", "addObserver", "removeObserver", "updateUserInfo", "getRankingFromMap", "", "userID", "scoreMap", "", "reset", "showBattleView", TIMPushProvider.f75062n, "", "onBattleResultDisplay", "display", "(Ljava/lang/Boolean;)V", "onPictureInPictureObserver", "isPipMode", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nBattleMemberInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleMemberInfoView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n126#3:192\n153#3,3:193\n1068#4:196\n*S KotlinDebug\n*F\n+ 1 BattleMemberInfoView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView\n*L\n129#1:192\n129#1:193,3\n130#1:196\n*E\n"})
public final class BattleMemberInfoView extends BasicView {

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Companion f78750x = new Companion(null);

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final LiveKitLogger f78751y = LiveKitLogger.f77564c.getLiveStreamLogger("BattleMemberInfoView");

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final int[] f78752z = {R$drawable.livekit_battle_ranking_1, R$drawable.livekit_battle_ranking_2, R$drawable.livekit_battle_ranking_3, R$drawable.livekit_battle_ranking_4, R$drawable.livekit_battle_ranking_5, R$drawable.livekit_battle_ranking_6, R$drawable.livekit_battle_ranking_7, R$drawable.livekit_battle_ranking_8, R$drawable.livekit_battle_ranking_9};

    /* JADX INFO: renamed from: s */
    @Nullable
    public String f78753s;

    /* JADX INFO: renamed from: t */
    public ImageView f78754t;

    /* JADX INFO: renamed from: u */
    public TextView f78755u;

    /* JADX INFO: renamed from: v */
    public TextView f78756v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final C36244a f78757w;

    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView$Companion;", "", "<init>", "()V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "RANKING_IMAGE", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$a */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView$battleListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "onBattleEnded", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36244a extends BattleListener {
        public C36244a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleEnded(BattleInfo battleInfo, BattleEndedReason reason) {
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            BattleMemberInfoView.this.m81022r();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BattleMemberInfoView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView\n*L\n1#1,328:1\n130#2:329\n*E\n"})
    public static final class C36249b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((TmpUser) t12).getScore()), Integer.valueOf(((TmpUser) t11).getScore()));
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$c, reason: from toString */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\"\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView$getRankingFromMap$TmpUser", "", "userId", "", FirebaseAnalytics.Param.SCORE, "", "<init>", "(Ljava/lang/String;I)V", "getUserId", "()Ljava/lang/String;", "getScore", "()I", "component1", "component2", "copy", "(Ljava/lang/String;I)Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleMemberInfoView$getRankingFromMap$TmpUser;", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TmpUser {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final String userId;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int score;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TmpUser)) {
                return false;
            }
            TmpUser tmpUser = (TmpUser) other;
            return Intrinsics.areEqual(this.userId, tmpUser.userId) && this.score == tmpUser.score;
        }

        public TmpUser(String userId, int i11) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.userId = userId;
            this.score = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getScore() {
            return this.score;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + Integer.hashCode(this.score);
        }

        public String toString() {
            return "TmpUser(userId=" + this.userId + ", score=" + this.score + ')';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BattleMemberInfoView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BattleMemberInfoView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0082  */
    /* JADX INFO: renamed from: l */
    private final int m81016l(String str, Map<String, Integer> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            arrayList.add(new TmpUser(entry.getKey(), entry.getValue().intValue()));
        }
        List<TmpUser> listSortedWith = CollectionsKt.sortedWith(arrayList, new C36249b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iIntValue = 0;
        for (TmpUser tmpUser : listSortedWith) {
            int i11 = iIntValue + 1;
            if (iIntValue > 0) {
                int i12 = iIntValue - 1;
                if (tmpUser.getScore() == ((TmpUser) listSortedWith.get(i12)).getScore()) {
                    Integer num = (Integer) linkedHashMap.get(((TmpUser) listSortedWith.get(i12)).getUserId());
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                } else {
                    iIntValue = i11;
                }
            } else {
                iIntValue = i11;
            }
            linkedHashMap.put(tmpUser.getUserId(), Integer.valueOf(iIntValue));
            iIntValue = i11;
        }
        Integer num2 = (Integer) linkedHashMap.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m81017o(Boolean bool) {
        if (Intrinsics.areEqual(Boolean.TRUE, bool)) {
            setVisibility(8);
            return;
        }
        BattleInfo value = getAudienceStore().m83087f().getCurrentBattleInfo().getValue();
        String battleID = value != null ? value.getBattleID() : null;
        if (battleID == null || StringsKt.isBlank(battleID)) {
            return;
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: p */
    private final void m81018p() {
        setVisibility(8);
        ImageView imageView = this.f78754t;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankingView");
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView2 = this.f78755u;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scoreView");
            textView2 = null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f78756v;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionStatusView");
        } else {
            textView = textView3;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: renamed from: m */
    public final void m81019m(@NotNull C37144f store, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f78753s = userId;
        super.mo80950b(store);
    }

    /* JADX INFO: renamed from: n */
    public final void m81020n(Boolean bool) {
        if (Intrinsics.areEqual(Boolean.FALSE, bool)) {
            m81018p();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BattleMemberInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78757w = new C36244a();
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80889a() {
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new BattleMemberInfoView$addObserver$1(this, null), 3, null));
        getAudienceStore().getF82426h().addBattleListener(this.f78757w);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80892c() {
        View.inflate(getContext(), R$layout.livekit_battle_member_info_view, this);
        View viewFindViewById = findViewById(R$id.iv_ranking);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78754t = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_score);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78755u = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tv_connection_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78756v = (TextView) viewFindViewById3;
        m81018p();
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80896e() {
        InterfaceC41775x1 f78705q = getF78705q();
        if (f78705q != null) {
            InterfaceC41775x1.a.m91377a(f78705q, null, 1, null);
        }
        getAudienceStore().getF82426h().removeBattleListener(this.f78757w);
    }

    /* JADX INFO: renamed from: q */
    public final void m81021q(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (getMediaState().m83111e().getValue().booleanValue()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        setVisibility(i11);
        ImageView imageView = this.f78754t;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rankingView");
            imageView = null;
        }
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        TextView textView2 = this.f78755u;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scoreView");
            textView2 = null;
        }
        if (z11) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        TextView textView3 = this.f78756v;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionStatusView");
        } else {
            textView = textView3;
        }
        if (z11) {
            i14 = 8;
        }
        textView.setVisibility(i14);
    }

    /* JADX INFO: renamed from: r */
    public final void m81022r() {
        boolean z11;
        int iIntValue;
        Object next;
        boolean z12;
        if (getAudienceStore().m83091j().getConnected().getValue().size() > 1) {
            ImageView imageView = null;
            SeatUserInfo seatUserInfo = null;
            for (SeatUserInfo seatUserInfo2 : getAudienceStore().m83091j().getConnected().getValue()) {
                if (Intrinsics.areEqual(seatUserInfo2.getUserID(), this.f78753s)) {
                    seatUserInfo = seatUserInfo2;
                }
            }
            if (getAudienceStore().m83091j().getConnected().getValue().size() <= 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            Integer num = getAudienceStore().m83087f().getBattleScore().getValue().get(this.f78753s);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Iterator<T> it = getAudienceStore().m83087f().getBattleUsers().getValue().iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((SeatUserInfo) next).getUserID(), this.f78753s));
            if (next != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            f78751y.m79404b("updateUserInfo is1V1Battle: " + z11 + ", userScore:" + iIntValue + ", currentUserIsBattle:" + z12 + ", userInfo: " + seatUserInfo);
            if (!z11 && seatUserInfo != null) {
                if (z12) {
                    m81021q(true);
                    TextView textView = this.f78755u;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("scoreView");
                        textView = null;
                    }
                    textView.setText(String.valueOf(iIntValue));
                    int iM81016l = m81016l(seatUserInfo.getUserID(), getAudienceStore().m83087f().getBattleScore().getValue());
                    if (iM81016l > 0) {
                        int[] iArr = f78752z;
                        if (iM81016l <= iArr.length) {
                            ImageView imageView2 = this.f78754t;
                            if (imageView2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("rankingView");
                            } else {
                                imageView = imageView2;
                            }
                            imageView.setImageResource(iArr[iM81016l - 1]);
                            return;
                        }
                        return;
                    }
                    return;
                }
                m81021q(false);
                return;
            }
            m81018p();
        }
    }
}
