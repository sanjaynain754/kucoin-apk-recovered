package com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.rtmp.TXLiveBase;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView;
import io.trtc.tuikit.atomicxcore.api.live.BattleEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
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
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BattleInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007*\u0001\u0014\b\u0007\u0018\u0000 92\u00020\u0001:\u000289B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0017H\u0003J\u0017\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020-H\u0002J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/03H\u0002J\b\u00104\u001a\u00020\u0019H\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\u0017\u00106\u001a\u00020\u00192\b\u00107\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0002\u0010+R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006:"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "mainHandler", "Landroid/os/Handler;", "battle1V1ScoreView", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/Battle1V1ScoreView;", "battleTimeView", "Landroid/widget/TextView;", "battleStartView", "Landroid/widget/ImageView;", "battleResultView", "battleListener", "com/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$battleListener$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$battleListener$1;", "getCurrentTimestamp", "", "initView", "", "addObserver", "removeObserver", "onBattleStart", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "onBattleEnd", "onBattleScoreChanged", "updateData", "inviter", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "invitee", "showBattleResult", "updateTime", "time", "onResultDisplay", "display", "", "(Ljava/lang/Boolean;)V", "getBattleResult", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$BattleResultType;", "getRankingFromMap", "", "userID", "", "scoreMap", "", "stopDisplayBattleResult", "onConnectedListChange", "onPictureInPictureObserver", "isPipMode", "BattleResultType", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nBattleInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleInfoView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n126#2:263\n153#2,3:264\n1068#3:267\n*S KotlinDebug\n*F\n+ 1 BattleInfoView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView\n*L\n217#1:263\n217#1:264,3\n218#1:267\n*E\n"})
public final class BattleInfoView extends BasicView {

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final Companion f78730z = new Companion(null);

    /* JADX INFO: renamed from: s */
    @NotNull
    public final LiveKitLogger f78731s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final Handler f78732t;

    /* JADX INFO: renamed from: u */
    public Battle1V1ScoreView f78733u;

    /* JADX INFO: renamed from: v */
    public TextView f78734v;

    /* JADX INFO: renamed from: w */
    public ImageView f78735w;

    /* JADX INFO: renamed from: x */
    public ImageView f78736x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final C36240b f78737y;

    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$BattleResultType;", "", "<init>", "(Ljava/lang/String;I)V", "DRAW", "VICTORY", "DEFEAT", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum BattleResultType {
        DRAW,
        VICTORY,
        DEFEAT;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f78739c = EnumEntriesKt.enumEntries(m81000a());

        @NotNull
        public static EnumEntries<BattleResultType> getEntries() {
            return f78739c;
        }
    }

    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$Companion;", "", "<init>", "()V", "BATTLE_END_INFO_DURATION", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$b */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$battleListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "onBattleEnded", "", "battleInfo", "Lio/trtc/tuikit/atomicxcore/api/live/BattleInfo;", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/BattleEndedReason;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36240b extends BattleListener {
        public C36240b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
        public void onBattleEnded(BattleInfo battleInfo, BattleEndedReason reason) {
            Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
            BattleInfoView.this.m80999w();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BattleInfoView.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView\n*L\n1#1,328:1\n218#2:329\n*E\n"})
    public static final class C36241c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((TmpUser) t12).getScore()), Integer.valueOf(((TmpUser) t11).getScore()));
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$d, reason: from toString */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\"\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$getRankingFromMap$TmpUser", "", "userId", "", FirebaseAnalytics.Param.SCORE, "", "<init>", "(Ljava/lang/String;I)V", "getUserId", "()Ljava/lang/String;", "getScore", "()I", "component1", "component2", "copy", "(Ljava/lang/String;I)Lcom/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$getRankingFromMap$TmpUser;", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$e */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/battle/widgets/BattleInfoView$onBattleStart$2", "Ljava/lang/Runnable;", "run", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC36243e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.IntRef f78748b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BattleInfoView f78749c;

        public RunnableC36243e(Ref.IntRef intRef, BattleInfoView battleInfoView) {
            this.f78748b = intRef;
            this.f78749c = battleInfoView;
        }

        /* JADX INFO: renamed from: b */
        public static final void m81009b(BattleInfoView battleInfoView, Ref.IntRef intRef) {
            battleInfoView.m80997J(intRef.element);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = this.f78748b.element;
            if (i11 <= 0 || this.f78749c.getViewState().m83112a().getValue().intValue() <= 0) {
                return;
            }
            final Ref.IntRef intRef = this.f78748b;
            intRef.element = i11 - 1;
            final BattleInfoView battleInfoView = this.f78749c;
            battleInfoView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.e
                @Override // java.lang.Runnable
                public final void run() {
                    BattleInfoView.RunnableC36243e.m81009b(battleInfoView, intRef);
                }
            });
            this.f78749c.f78732t.postDelayed(this, 1000L);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BattleInfoView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$a */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C36234a {
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BattleInfoView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: C */
    public static final void m80969C(BattleInfoView battleInfoView) {
        ImageView imageView = battleInfoView.f78735w;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleStartView");
            imageView = null;
        }
        imageView.setVisibility(8);
    }

    /* JADX INFO: renamed from: x */
    public static final void m80986x(final BattleInfoView battleInfoView) {
        battleInfoView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.c
            @Override // java.lang.Runnable
            public final void run() {
                BattleInfoView.m80987y(this.f78767b);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final void m80989A() {
        HashMap map = new HashMap();
        if (getAudienceStore().m83091j().getConnected().getValue().size() == 2) {
            for (SeatUserInfo seatUserInfo : getAudienceStore().m83091j().getConnected().getValue()) {
                map.put(seatUserInfo.getUserID(), seatUserInfo);
            }
        }
        if (getAudienceStore().m83091j().getConnected().getValue().size() != 2) {
            Battle1V1ScoreView battle1V1ScoreView = this.f78733u;
            if (battle1V1ScoreView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("battle1V1ScoreView");
                battle1V1ScoreView = null;
            }
            battle1V1ScoreView.setVisibility(8);
            return;
        }
        ArrayList arrayList = new ArrayList(map.values());
        Object obj = arrayList.get(1);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        Object obj2 = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        m80996I((SeatUserInfo) obj, (SeatUserInfo) obj2);
    }

    /* JADX INFO: renamed from: E */
    public final void m80992E(Boolean bool) {
        if (Intrinsics.areEqual(Boolean.TRUE, bool)) {
            setVisibility(8);
            return;
        }
        BattleInfo value = getAudienceStore().getF82426h().getBattleState().getCurrentBattleInfo().getValue();
        String battleID = value != null ? value.getBattleID() : null;
        if (battleID == null || StringsKt.isBlank(battleID)) {
            return;
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: F */
    public final void m80993F(Boolean bool) {
        this.f78731s.m79404b("onResultDisplay: " + bool + "： hashCode->" + hashCode());
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            m80994G();
        } else if (Intrinsics.areEqual(Boolean.FALSE, bool)) {
            m80995H();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m80995H() {
        m80997J(0L);
        setVisibility(8);
        ImageView imageView = this.f78735w;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleStartView");
            imageView = null;
        }
        imageView.setVisibility(8);
        ImageView imageView3 = this.f78736x;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleResultView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(8);
    }

    /* JADX INFO: renamed from: I */
    public final void m80996I(SeatUserInfo seatUserInfo, SeatUserInfo seatUserInfo2) {
        Battle1V1ScoreView battle1V1ScoreView = this.f78733u;
        Battle1V1ScoreView battle1V1ScoreView2 = null;
        if (battle1V1ScoreView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battle1V1ScoreView");
            battle1V1ScoreView = null;
        }
        battle1V1ScoreView.setVisibility(0);
        Battle1V1ScoreView battle1V1ScoreView3 = this.f78733u;
        if (battle1V1ScoreView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battle1V1ScoreView");
        } else {
            battle1V1ScoreView2 = battle1V1ScoreView3;
        }
        Integer num = getAudienceStore().m83087f().getBattleScore().getValue().get(seatUserInfo.getUserID());
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = getAudienceStore().m83087f().getBattleScore().getValue().get(seatUserInfo2.getUserID());
        battle1V1ScoreView2.m80968b(iIntValue, num2 != null ? num2.intValue() : 0);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: J */
    public final void m80997J(long j11) {
        TextView textView = this.f78734v;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleTimeView");
            textView = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        long j12 = 60;
        String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12), Long.valueOf(j11 % j12)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        if (j11 == 0) {
            TextView textView3 = this.f78734v;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("battleTimeView");
            } else {
                textView2 = textView3;
            }
            textView2.setText(getContext().getString(R$string.common_battle_pk_end));
        }
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: a */
    public void mo80889a() {
        this.f78731s.m79404b("addObserver:" + hashCode());
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new BattleInfoView$addObserver$1(this, null), 3, null));
        getAudienceStore().getF82426h().addBattleListener(this.f78737y);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: e */
    public void mo80896e() {
        this.f78731s.m79404b("removeObserver:" + hashCode());
        InterfaceC41775x1 f78705q = getF78705q();
        if (f78705q != null) {
            InterfaceC41775x1.a.m91377a(f78705q, null, 1, null);
        }
        getAudienceStore().getF82426h().removeBattleListener(this.f78737y);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0083  */
    /* JADX INFO: renamed from: v */
    public final int m80998v(String str, Map<String, Integer> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            arrayList.add(new TmpUser(entry.getKey(), entry.getValue().intValue()));
        }
        List<TmpUser> listSortedWith = CollectionsKt.sortedWith(arrayList, new C36241c());
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
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public final void m80999w() {
        this.f78731s.m79404b("onBattleEnd:" + hashCode());
        setVisibility(getMediaState().m83111e().getValue().booleanValue() ? 8 : 0);
        getAudienceStore().m83102u().m83115d().setValue(Boolean.TRUE);
        getViewState().m83112a().setValue(0);
        m80997J(0L);
        this.f78732t.postDelayed(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.a
            @Override // java.lang.Runnable
            public final void run() {
                BattleInfoView.m80986x(this.f78765b);
            }
        }, 5000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BattleInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78731s = LiveKitLogger.f77564c.getLiveStreamLogger("BattleInfoView");
        this.f78732t = new Handler(Looper.getMainLooper());
        this.f78737y = new C36240b();
    }

    private final BattleResultType getBattleResult() {
        List<SeatUserInfo> value = getAudienceStore().m83087f().getBattleUsers().getValue();
        if (value.isEmpty()) {
            return BattleResultType.DRAW;
        }
        SeatUserInfo seatUserInfo = value.get(0);
        SeatUserInfo seatUserInfo2 = value.get(value.size() - 1);
        int iM80998v = m80998v(seatUserInfo.getUserID(), getAudienceStore().m83087f().getBattleScore().getValue());
        int iM80998v2 = m80998v(seatUserInfo2.getUserID(), getAudienceStore().m83087f().getBattleScore().getValue());
        if (iM80998v > iM80998v2) {
            return BattleResultType.VICTORY;
        }
        if (iM80998v < iM80998v2) {
            return BattleResultType.DEFEAT;
        }
        return BattleResultType.DRAW;
    }

    private final long getCurrentTimestamp() {
        long networkTimestamp = TXLiveBase.getNetworkTimestamp();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (networkTimestamp > 0) {
            return networkTimestamp;
        }
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: y */
    public static final void m80987y(final BattleInfoView battleInfoView) {
        battleInfoView.getAudienceStore().m83102u().m83115d().setValue(Boolean.FALSE);
        battleInfoView.f78732t.postDelayed(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.d
            @Override // java.lang.Runnable
            public final void run() {
                BattleInfoView.m80988z(this.f78768b);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: z */
    public static final void m80988z(BattleInfoView battleInfoView) {
        battleInfoView.getAudienceStore().m83102u().m83115d().setValue(null);
    }

    /* JADX INFO: renamed from: B */
    public final void m80990B(BattleInfo battleInfo) {
        int i11;
        if (getMediaState().m83111e().getValue().booleanValue()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        setVisibility(i11);
        ImageView imageView = null;
        if (getCoHostState().getConnected().getValue().size() == 2) {
            Battle1V1ScoreView battle1V1ScoreView = this.f78733u;
            if (battle1V1ScoreView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("battle1V1ScoreView");
                battle1V1ScoreView = null;
            }
            battle1V1ScoreView.setVisibility(getVisibility());
        } else {
            Battle1V1ScoreView battle1V1ScoreView2 = this.f78733u;
            if (battle1V1ScoreView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("battle1V1ScoreView");
                battle1V1ScoreView2 = null;
            }
            battle1V1ScoreView2.setVisibility(8);
        }
        ImageView imageView2 = this.f78735w;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleStartView");
        } else {
            imageView = imageView2;
        }
        imageView.setVisibility(0);
        postDelayed(new Runnable() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.b
            @Override // java.lang.Runnable
            public final void run() {
                BattleInfoView.m80969C(this.f78766b);
            }
        }, 1000L);
        Ref.IntRef intRef = new Ref.IntRef();
        int duration = (int) ((((long) battleInfo.getConfig().getDuration()) + battleInfo.getStartTime()) - (getCurrentTimestamp() / ((long) 1000)));
        intRef.element = duration;
        int iCoerceAtMost = RangesKt.coerceAtMost(duration, battleInfo.getConfig().getDuration());
        intRef.element = iCoerceAtMost;
        intRef.element = RangesKt.coerceAtLeast(iCoerceAtMost, 0);
        getViewState().m83112a().setValue(Integer.valueOf(intRef.element));
        this.f78732t.postDelayed(new RunnableC36243e(intRef, this), 1000L);
    }

    /* JADX INFO: renamed from: D */
    public final void m80991D() {
        if (getAudienceStore().m83091j().getConnected().getValue().size() <= 1) {
            getAudienceStore().getF82429k().m80788e();
        } else {
            m80989A();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m80994G() {
        int i11;
        BattleResultType battleResult = getBattleResult();
        ImageView imageView = this.f78736x;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleResultView");
            imageView = null;
        }
        imageView.setVisibility(0);
        int i12 = C36234a.$EnumSwitchMapping$0[battleResult.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                i11 = R$drawable.livekit_battle_result_draw;
            } else {
                i11 = R$drawable.livekit_battle_result_defeat;
            }
        } else {
            i11 = R$drawable.livekit_battle_result_victory;
        }
        ImageView imageView3 = this.f78736x;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("battleResultView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setImageResource(i11);
    }

    @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.BasicView
    /* JADX INFO: renamed from: c */
    public void mo80892c() {
        View.inflate(getContext(), R$layout.livekit_audience_battle_info_view, this);
        View viewFindViewById = findViewById(R$id.tv_battle_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78734v = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.iv_battle_start);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78735w = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_battle_result);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78736x = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.single_battle_score_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78733u = (Battle1V1ScoreView) viewFindViewById4;
        setVisibility(8);
    }
}
