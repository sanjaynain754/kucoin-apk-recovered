package com.kubi.redpackage.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedpacketDetailEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001:\u0001MB»\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00104\u001a\u0004\u0018\u00010\u000fJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jæ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00072\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0011HÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u0006\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\b\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010,\u001a\u0004\b.\u0010+R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010,\u001a\u0004\b/\u0010+R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010,\u001a\u0004\b0\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u0018\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006N"}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedpacketDetailEntity;", "", "id", "", FirebaseAnalytics.Param.CURRENCY, "bestWishes", "isSelf", "", "isReceive", "sendAt", "", "firstAt", "lastAt", "nickName", "receiveAmount", "Ljava/math/BigDecimal;", "receiveNum", "", "sendAmount", "sendNum", "welfareStatus", "welfareType", "receive", "Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;", "isNewBee", "extendUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCurrency", "getBestWishes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSendAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFirstAt", "getLastAt", "getNickName", "getReceiveAmount", "()Ljava/math/BigDecimal;", "getReceiveNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSendAmount", "getSendNum", "getWelfareStatus", "getWelfareType", "getReceive", "()Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;", "getExtendUrl", "remainAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/redpackage/entity/RedpacketDetailEntity;", "equals", "other", "hashCode", "toString", "ReceiveEntity", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedpacketDetailEntity {

    @Nullable
    private final String bestWishes;

    @Nullable
    private final String currency;

    @Nullable
    private final String extendUrl;

    @Nullable
    private final Long firstAt;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isNewBee;

    @Nullable
    private final Boolean isReceive;

    @Nullable
    private final Boolean isSelf;

    @Nullable
    private final Long lastAt;

    @Nullable
    private final String nickName;

    @Nullable
    private final ReceiveEntity receive;

    @Nullable
    private final BigDecimal receiveAmount;

    @Nullable
    private final Integer receiveNum;

    @Nullable
    private final BigDecimal sendAmount;

    @Nullable
    private final Long sendAt;

    @Nullable
    private final Integer sendNum;

    @Nullable
    private final Integer welfareStatus;

    @Nullable
    private final Integer welfareType;

    /* JADX INFO: compiled from: RedpacketDetailEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJn\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "id", "isSelf", "", "nickName", "receiveAmount", "Ljava/math/BigDecimal;", "receiveAt", "", "sendNickName", "receiveStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getCurrency", "()Ljava/lang/String;", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickName", "getReceiveAmount", "()Ljava/math/BigDecimal;", "getReceiveAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSendNickName", "getReceiveStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/redpackage/entity/RedpacketDetailEntity$ReceiveEntity;", "equals", "other", "hashCode", "toString", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ReceiveEntity {

        @Nullable
        private final String currency;

        @Nullable
        private final String id;

        @Nullable
        private final Boolean isSelf;

        @Nullable
        private final String nickName;

        @Nullable
        private final BigDecimal receiveAmount;

        @Nullable
        private final Long receiveAt;

        @Nullable
        private final Integer receiveStatus;

        @Nullable
        private final String sendNickName;

        public static /* synthetic */ ReceiveEntity copy$default(ReceiveEntity receiveEntity, String str, String str2, Boolean bool, String str3, BigDecimal bigDecimal, Long l11, String str4, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = receiveEntity.currency;
            }
            if ((i11 & 2) != 0) {
                str2 = receiveEntity.id;
            }
            if ((i11 & 4) != 0) {
                bool = receiveEntity.isSelf;
            }
            if ((i11 & 8) != 0) {
                str3 = receiveEntity.nickName;
            }
            if ((i11 & 16) != 0) {
                bigDecimal = receiveEntity.receiveAmount;
            }
            if ((i11 & 32) != 0) {
                l11 = receiveEntity.receiveAt;
            }
            if ((i11 & 64) != 0) {
                str4 = receiveEntity.sendNickName;
            }
            if ((i11 & 128) != 0) {
                num = receiveEntity.receiveStatus;
            }
            String str5 = str4;
            Integer num2 = num;
            BigDecimal bigDecimal2 = bigDecimal;
            Long l12 = l11;
            return receiveEntity.copy(str, str2, bool, str3, bigDecimal2, l12, str5, num2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReceiveEntity)) {
                return false;
            }
            ReceiveEntity receiveEntity = (ReceiveEntity) other;
            return Intrinsics.areEqual(this.currency, receiveEntity.currency) && Intrinsics.areEqual(this.id, receiveEntity.id) && Intrinsics.areEqual(this.isSelf, receiveEntity.isSelf) && Intrinsics.areEqual(this.nickName, receiveEntity.nickName) && Intrinsics.areEqual(this.receiveAmount, receiveEntity.receiveAmount) && Intrinsics.areEqual(this.receiveAt, receiveEntity.receiveAt) && Intrinsics.areEqual(this.sendNickName, receiveEntity.sendNickName) && Intrinsics.areEqual(this.receiveStatus, receiveEntity.receiveStatus);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getIsSelf() {
            return this.isSelf;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BigDecimal getReceiveAmount() {
            return this.receiveAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getReceiveAt() {
            return this.receiveAt;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSendNickName() {
            return this.sendNickName;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Integer getReceiveStatus() {
            return this.receiveStatus;
        }

        @NotNull
        public final ReceiveEntity copy(@Nullable String currency, @Nullable String id2, @Nullable Boolean isSelf, @Nullable String nickName, @Nullable BigDecimal receiveAmount, @Nullable Long receiveAt, @Nullable String sendNickName, @Nullable Integer receiveStatus) {
            return new ReceiveEntity(currency, id2, isSelf, nickName, receiveAmount, receiveAt, sendNickName, receiveStatus);
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        public final BigDecimal getReceiveAmount() {
            return this.receiveAmount;
        }

        @Nullable
        public final Long getReceiveAt() {
            return this.receiveAt;
        }

        @Nullable
        public final Integer getReceiveStatus() {
            return this.receiveStatus;
        }

        @Nullable
        public final String getSendNickName() {
            return this.sendNickName;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isSelf;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.nickName;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BigDecimal bigDecimal = this.receiveAmount;
            int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Long l11 = this.receiveAt;
            int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str4 = this.sendNickName;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.receiveStatus;
            return iHashCode7 + (num != null ? num.hashCode() : 0);
        }

        @Nullable
        public final Boolean isSelf() {
            return this.isSelf;
        }

        @NotNull
        public String toString() {
            return "ReceiveEntity(currency=" + this.currency + ", id=" + this.id + ", isSelf=" + this.isSelf + ", nickName=" + this.nickName + ", receiveAmount=" + this.receiveAmount + ", receiveAt=" + this.receiveAt + ", sendNickName=" + this.sendNickName + ", receiveStatus=" + this.receiveStatus + ')';
        }

        public ReceiveEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable String str4, @Nullable Integer num) {
            this.currency = str;
            this.id = str2;
            this.isSelf = bool;
            this.nickName = str3;
            this.receiveAmount = bigDecimal;
            this.receiveAt = l11;
            this.sendNickName = str4;
            this.receiveStatus = num;
        }
    }

    public static /* synthetic */ RedpacketDetailEntity copy$default(RedpacketDetailEntity redpacketDetailEntity, String str, String str2, String str3, Boolean bool, Boolean bool2, Long l11, Long l12, Long l13, String str4, BigDecimal bigDecimal, Integer num, BigDecimal bigDecimal2, Integer num2, Integer num3, Integer num4, ReceiveEntity receiveEntity, Boolean bool3, String str5, int i11, Object obj) {
        String str6;
        Boolean bool4;
        String str7 = (i11 & 1) != 0 ? redpacketDetailEntity.id : str;
        String str8 = (i11 & 2) != 0 ? redpacketDetailEntity.currency : str2;
        String str9 = (i11 & 4) != 0 ? redpacketDetailEntity.bestWishes : str3;
        Boolean bool5 = (i11 & 8) != 0 ? redpacketDetailEntity.isSelf : bool;
        Boolean bool6 = (i11 & 16) != 0 ? redpacketDetailEntity.isReceive : bool2;
        Long l14 = (i11 & 32) != 0 ? redpacketDetailEntity.sendAt : l11;
        Long l15 = (i11 & 64) != 0 ? redpacketDetailEntity.firstAt : l12;
        Long l16 = (i11 & 128) != 0 ? redpacketDetailEntity.lastAt : l13;
        String str10 = (i11 & 256) != 0 ? redpacketDetailEntity.nickName : str4;
        BigDecimal bigDecimal3 = (i11 & 512) != 0 ? redpacketDetailEntity.receiveAmount : bigDecimal;
        Integer num5 = (i11 & 1024) != 0 ? redpacketDetailEntity.receiveNum : num;
        BigDecimal bigDecimal4 = (i11 & 2048) != 0 ? redpacketDetailEntity.sendAmount : bigDecimal2;
        Integer num6 = (i11 & 4096) != 0 ? redpacketDetailEntity.sendNum : num2;
        Integer num7 = (i11 & 8192) != 0 ? redpacketDetailEntity.welfareStatus : num3;
        String str11 = str7;
        Integer num8 = (i11 & 16384) != 0 ? redpacketDetailEntity.welfareType : num4;
        ReceiveEntity receiveEntity2 = (i11 & 32768) != 0 ? redpacketDetailEntity.receive : receiveEntity;
        Boolean bool7 = (i11 & 65536) != 0 ? redpacketDetailEntity.isNewBee : bool3;
        if ((i11 & 131072) != 0) {
            bool4 = bool7;
            str6 = redpacketDetailEntity.extendUrl;
        } else {
            str6 = str5;
            bool4 = bool7;
        }
        return redpacketDetailEntity.copy(str11, str8, str9, bool5, bool6, l14, l15, l16, str10, bigDecimal3, num5, bigDecimal4, num6, num7, num8, receiveEntity2, bool4, str6);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedpacketDetailEntity)) {
            return false;
        }
        RedpacketDetailEntity redpacketDetailEntity = (RedpacketDetailEntity) other;
        return Intrinsics.areEqual(this.id, redpacketDetailEntity.id) && Intrinsics.areEqual(this.currency, redpacketDetailEntity.currency) && Intrinsics.areEqual(this.bestWishes, redpacketDetailEntity.bestWishes) && Intrinsics.areEqual(this.isSelf, redpacketDetailEntity.isSelf) && Intrinsics.areEqual(this.isReceive, redpacketDetailEntity.isReceive) && Intrinsics.areEqual(this.sendAt, redpacketDetailEntity.sendAt) && Intrinsics.areEqual(this.firstAt, redpacketDetailEntity.firstAt) && Intrinsics.areEqual(this.lastAt, redpacketDetailEntity.lastAt) && Intrinsics.areEqual(this.nickName, redpacketDetailEntity.nickName) && Intrinsics.areEqual(this.receiveAmount, redpacketDetailEntity.receiveAmount) && Intrinsics.areEqual(this.receiveNum, redpacketDetailEntity.receiveNum) && Intrinsics.areEqual(this.sendAmount, redpacketDetailEntity.sendAmount) && Intrinsics.areEqual(this.sendNum, redpacketDetailEntity.sendNum) && Intrinsics.areEqual(this.welfareStatus, redpacketDetailEntity.welfareStatus) && Intrinsics.areEqual(this.welfareType, redpacketDetailEntity.welfareType) && Intrinsics.areEqual(this.receive, redpacketDetailEntity.receive) && Intrinsics.areEqual(this.isNewBee, redpacketDetailEntity.isNewBee) && Intrinsics.areEqual(this.extendUrl, redpacketDetailEntity.extendUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getReceiveNum() {
        return this.receiveNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getSendAmount() {
        return this.sendAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getSendNum() {
        return this.sendNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getWelfareStatus() {
        return this.welfareStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getWelfareType() {
        return this.welfareType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final ReceiveEntity getReceive() {
        return this.receive;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsNewBee() {
        return this.isNewBee;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getExtendUrl() {
        return this.extendUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBestWishes() {
        return this.bestWishes;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsSelf() {
        return this.isSelf;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsReceive() {
        return this.isReceive;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getSendAt() {
        return this.sendAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getFirstAt() {
        return this.firstAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getLastAt() {
        return this.lastAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final RedpacketDetailEntity copy(@Nullable String id2, @Nullable String currency, @Nullable String bestWishes, @Nullable Boolean isSelf, @Nullable Boolean isReceive, @Nullable Long sendAt, @Nullable Long firstAt, @Nullable Long lastAt, @Nullable String nickName, @Nullable BigDecimal receiveAmount, @Nullable Integer receiveNum, @Nullable BigDecimal sendAmount, @Nullable Integer sendNum, @Nullable Integer welfareStatus, @Nullable Integer welfareType, @Nullable ReceiveEntity receive, @Nullable Boolean isNewBee, @Nullable String extendUrl) {
        return new RedpacketDetailEntity(id2, currency, bestWishes, isSelf, isReceive, sendAt, firstAt, lastAt, nickName, receiveAmount, receiveNum, sendAmount, sendNum, welfareStatus, welfareType, receive, isNewBee, extendUrl);
    }

    @Nullable
    public final String getBestWishes() {
        return this.bestWishes;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getExtendUrl() {
        return this.extendUrl;
    }

    @Nullable
    public final Long getFirstAt() {
        return this.firstAt;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getLastAt() {
        return this.lastAt;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final ReceiveEntity getReceive() {
        return this.receive;
    }

    @Nullable
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    public final Integer getReceiveNum() {
        return this.receiveNum;
    }

    @Nullable
    public final BigDecimal getSendAmount() {
        return this.sendAmount;
    }

    @Nullable
    public final Long getSendAt() {
        return this.sendAt;
    }

    @Nullable
    public final Integer getSendNum() {
        return this.sendNum;
    }

    @Nullable
    public final Integer getWelfareStatus() {
        return this.welfareStatus;
    }

    @Nullable
    public final Integer getWelfareType() {
        return this.welfareType;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bestWishes;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isSelf;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReceive;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l11 = this.sendAt;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.firstAt;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.lastAt;
        int iHashCode8 = (iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.nickName;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.receiveAmount;
        int iHashCode10 = (iHashCode9 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.receiveNum;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.sendAmount;
        int iHashCode12 = (iHashCode11 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Integer num2 = this.sendNum;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.welfareStatus;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.welfareType;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ReceiveEntity receiveEntity = this.receive;
        int iHashCode16 = (iHashCode15 + (receiveEntity == null ? 0 : receiveEntity.hashCode())) * 31;
        Boolean bool3 = this.isNewBee;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.extendUrl;
        return iHashCode17 + (str5 != null ? str5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNewBee() {
        return this.isNewBee;
    }

    @Nullable
    public final Boolean isReceive() {
        return this.isReceive;
    }

    @Nullable
    public final Boolean isSelf() {
        return this.isSelf;
    }

    @Nullable
    public final BigDecimal remainAmount() {
        BigDecimal bigDecimal = this.sendAmount;
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(C41014a.m89921F(this.receiveAmount, "0"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @NotNull
    public String toString() {
        return "RedpacketDetailEntity(id=" + this.id + ", currency=" + this.currency + ", bestWishes=" + this.bestWishes + ", isSelf=" + this.isSelf + ", isReceive=" + this.isReceive + ", sendAt=" + this.sendAt + ", firstAt=" + this.firstAt + ", lastAt=" + this.lastAt + ", nickName=" + this.nickName + ", receiveAmount=" + this.receiveAmount + ", receiveNum=" + this.receiveNum + ", sendAmount=" + this.sendAmount + ", sendNum=" + this.sendNum + ", welfareStatus=" + this.welfareStatus + ", welfareType=" + this.welfareType + ", receive=" + this.receive + ", isNewBee=" + this.isNewBee + ", extendUrl=" + this.extendUrl + ')';
    }

    public RedpacketDetailEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable Integer num, @Nullable BigDecimal bigDecimal2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable ReceiveEntity receiveEntity, @Nullable Boolean bool3, @Nullable String str5) {
        this.id = str;
        this.currency = str2;
        this.bestWishes = str3;
        this.isSelf = bool;
        this.isReceive = bool2;
        this.sendAt = l11;
        this.firstAt = l12;
        this.lastAt = l13;
        this.nickName = str4;
        this.receiveAmount = bigDecimal;
        this.receiveNum = num;
        this.sendAmount = bigDecimal2;
        this.sendNum = num2;
        this.welfareStatus = num3;
        this.welfareType = num4;
        this.receive = receiveEntity;
        this.isNewBee = bool3;
        this.extendUrl = str5;
    }
}
