package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27024b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012(\b\u0002\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f\u00128\b\u0002\u0010\u0010\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f\u00128\b\u0002\u0010\u0012\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\rJ\u000e\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000207J\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ)\u0010?\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fHÆ\u0003J9\u0010@\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000fHÆ\u0003J9\u0010A\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000fHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\u0011HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003J¤\u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052(\b\u0002\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f28\b\u0002\u0010\u0010\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f28\b\u0002\u0010\u0012\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u00020\u0003J\u0013\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\t\u0010M\u001a\u00020\rHÖ\u0001J\u0016\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001cR1\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&RA\u0010\u0010\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&RA\u0010\u0012\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-¨\u0006S"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcUserInfo;", "Landroid/os/Parcelable;", "kycLevel", "", "bindPhone", "", "bindTradePassword", "createdAt", "", "kyc", "merchant", "userKycDayLimitConfigs", "Ljava/util/HashMap;", "", "Lcom/kubi/otc/entity/LimitDays;", "Lkotlin/collections/HashMap;", "payTypeCodeMap", "", "payTypeIdMap", "availableLegals", "signedPact", "kycArea", "kycName", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;ZLjava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getKycLevel", "()I", "getBindPhone", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBindTradePassword", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKyc", "()Z", "getMerchant", "getUserKycDayLimitConfigs", "()Ljava/util/HashMap;", "getPayTypeCodeMap", "getPayTypeIdMap", "getAvailableLegals", "()Ljava/util/List;", "getSignedPact", "getKycArea", "()Ljava/lang/String;", "getKycName", "isUS", "isCA", "isHighKycLevel", "isRealLowKycLevel", "isSupportLegal", "legal", "isSupportPayWay", "item", "Lcom/kubi/otc/entity/OtcInfoEntity;", "getSupportPayWay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;ZLjava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/OtcUserInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/OtcUserInfo\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,710:1\n216#2,2:711\n*S KotlinDebug\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/OtcUserInfo\n*L\n264#1:711,2\n*E\n"})
public final /* data */ class OtcUserInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OtcUserInfo> CREATOR = new Creator();

    @NotNull
    private final List<String> availableLegals;

    @Nullable
    private final Boolean bindPhone;

    @Nullable
    private final Boolean bindTradePassword;

    @Nullable
    private final Long createdAt;
    private final boolean kyc;

    @Nullable
    private final String kycArea;
    private final int kycLevel;

    @Nullable
    private final String kycName;

    @Nullable
    private final Boolean merchant;

    @Nullable
    private final HashMap<String, List<String>> payTypeCodeMap;

    @Nullable
    private final HashMap<String, List<String>> payTypeIdMap;

    @Nullable
    private final Boolean signedPact;

    @Nullable
    private final HashMap<String, LimitDays> userKycDayLimitConfigs;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OtcUserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Failed to calculate best type for var: r10v4 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r10v4 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r10v5 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r10v5 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r10v6 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r11v0 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r11v0 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r11v2 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r11v3 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r12v3 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r12v3 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r13v4 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r13v4 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r13v6 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: java.lang.Boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r13v7 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v7 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r2v5 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v5 ??, new type: java.lang.Boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 6 more
         */
        /* JADX WARN: Failed to calculate best type for var: r2v5 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v5 ??, new type: java.lang.Boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r2v9 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: java.lang.Boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r9v7 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: java.util.HashMap
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v5 ??, new type: java.lang.Object
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
            	... 5 more
            */
        @Override // android.os.Parcelable.Creator
        public final com.kubi.otc.entity.OtcUserInfo createFromParcel(android.os.Parcel r17) {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kubi.otc.entity.OtcUserInfo.Creator.createFromParcel(android.os.Parcel):com.kubi.otc.entity.OtcUserInfo");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcUserInfo[] newArray(int i11) {
            return new OtcUserInfo[i11];
        }
    }

    public OtcUserInfo() {
        this(0, null, null, null, false, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtcUserInfo copy$default(OtcUserInfo otcUserInfo, int i11, Boolean bool, Boolean bool2, Long l11, boolean z11, Boolean bool3, HashMap map, HashMap map2, HashMap map3, List list, Boolean bool4, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = otcUserInfo.kycLevel;
        }
        return otcUserInfo.copy(i11, (i12 & 2) != 0 ? otcUserInfo.bindPhone : bool, (i12 & 4) != 0 ? otcUserInfo.bindTradePassword : bool2, (i12 & 8) != 0 ? otcUserInfo.createdAt : l11, (i12 & 16) != 0 ? otcUserInfo.kyc : z11, (i12 & 32) != 0 ? otcUserInfo.merchant : bool3, (i12 & 64) != 0 ? otcUserInfo.userKycDayLimitConfigs : map, (i12 & 128) != 0 ? otcUserInfo.payTypeCodeMap : map2, (i12 & 256) != 0 ? otcUserInfo.payTypeIdMap : map3, (i12 & 512) != 0 ? otcUserInfo.availableLegals : list, (i12 & 1024) != 0 ? otcUserInfo.signedPact : bool4, (i12 & 2048) != 0 ? otcUserInfo.kycArea : str, (i12 & 4096) != 0 ? otcUserInfo.kycName : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtcUserInfo)) {
            return false;
        }
        OtcUserInfo otcUserInfo = (OtcUserInfo) other;
        return this.kycLevel == otcUserInfo.kycLevel && Intrinsics.areEqual(this.bindPhone, otcUserInfo.bindPhone) && Intrinsics.areEqual(this.bindTradePassword, otcUserInfo.bindTradePassword) && Intrinsics.areEqual(this.createdAt, otcUserInfo.createdAt) && this.kyc == otcUserInfo.kyc && Intrinsics.areEqual(this.merchant, otcUserInfo.merchant) && Intrinsics.areEqual(this.userKycDayLimitConfigs, otcUserInfo.userKycDayLimitConfigs) && Intrinsics.areEqual(this.payTypeCodeMap, otcUserInfo.payTypeCodeMap) && Intrinsics.areEqual(this.payTypeIdMap, otcUserInfo.payTypeIdMap) && Intrinsics.areEqual(this.availableLegals, otcUserInfo.availableLegals) && Intrinsics.areEqual(this.signedPact, otcUserInfo.signedPact) && Intrinsics.areEqual(this.kycArea, otcUserInfo.kycArea) && Intrinsics.areEqual(this.kycName, otcUserInfo.kycName);
    }

    public OtcUserInfo(int i11, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l11, boolean z11, @Nullable Boolean bool3, @Nullable HashMap<String, LimitDays> map, @Nullable HashMap<String, List<String>> map2, @Nullable HashMap<String, List<String>> map3, @NotNull List<String> availableLegals, @Nullable Boolean bool4, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(availableLegals, "availableLegals");
        this.kycLevel = i11;
        this.bindPhone = bool;
        this.bindTradePassword = bool2;
        this.createdAt = l11;
        this.kyc = z11;
        this.merchant = bool3;
        this.userKycDayLimitConfigs = map;
        this.payTypeCodeMap = map2;
        this.payTypeIdMap = map3;
        this.availableLegals = availableLegals;
        this.signedPact = bool4;
        this.kycArea = str;
        this.kycName = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getKycLevel() {
        return this.kycLevel;
    }

    @NotNull
    public final List<String> component10() {
        return this.availableLegals;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getSignedPact() {
        return this.signedPact;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getKycArea() {
        return this.kycArea;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getKycName() {
        return this.kycName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getBindPhone() {
        return this.bindPhone;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getBindTradePassword() {
        return this.bindTradePassword;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getKyc() {
        return this.kyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getMerchant() {
        return this.merchant;
    }

    @Nullable
    public final HashMap<String, LimitDays> component7() {
        return this.userKycDayLimitConfigs;
    }

    @Nullable
    public final HashMap<String, List<String>> component8() {
        return this.payTypeCodeMap;
    }

    @Nullable
    public final HashMap<String, List<String>> component9() {
        return this.payTypeIdMap;
    }

    @NotNull
    public final OtcUserInfo copy(int kycLevel, @Nullable Boolean bindPhone, @Nullable Boolean bindTradePassword, @Nullable Long createdAt, boolean kyc, @Nullable Boolean merchant, @Nullable HashMap<String, LimitDays> userKycDayLimitConfigs, @Nullable HashMap<String, List<String>> payTypeCodeMap, @Nullable HashMap<String, List<String>> payTypeIdMap, @NotNull List<String> availableLegals, @Nullable Boolean signedPact, @Nullable String kycArea, @Nullable String kycName) {
        Intrinsics.checkNotNullParameter(availableLegals, "availableLegals");
        return new OtcUserInfo(kycLevel, bindPhone, bindTradePassword, createdAt, kyc, merchant, userKycDayLimitConfigs, payTypeCodeMap, payTypeIdMap, availableLegals, signedPact, kycArea, kycName);
    }

    @NotNull
    public final List<String> getAvailableLegals() {
        return this.availableLegals;
    }

    @Nullable
    public final Boolean getBindPhone() {
        return this.bindPhone;
    }

    @Nullable
    public final Boolean getBindTradePassword() {
        return this.bindTradePassword;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getKyc() {
        return this.kyc;
    }

    @Nullable
    public final String getKycArea() {
        return this.kycArea;
    }

    public final int getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final String getKycName() {
        return this.kycName;
    }

    @Nullable
    public final Boolean getMerchant() {
        return this.merchant;
    }

    @Nullable
    public final HashMap<String, List<String>> getPayTypeCodeMap() {
        return this.payTypeCodeMap;
    }

    @Nullable
    public final HashMap<String, List<String>> getPayTypeIdMap() {
        return this.payTypeIdMap;
    }

    @Nullable
    public final Boolean getSignedPact() {
        return this.signedPact;
    }

    @NotNull
    public final List<String> getSupportPayWay() {
        ArrayList arrayList = new ArrayList();
        HashMap<String, List<String>> map = this.payTypeCodeMap;
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> value = entry.getValue();
                if (value != null && !value.isEmpty()) {
                    arrayList.addAll(C27024b.m66560c(entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public final HashMap<String, LimitDays> getUserKycDayLimitConfigs() {
        return this.userKycDayLimitConfigs;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.kycLevel) * 31;
        Boolean bool = this.bindPhone;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.bindTradePassword;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode4 = (((iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31) + Boolean.hashCode(this.kyc)) * 31;
        Boolean bool3 = this.merchant;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        HashMap<String, LimitDays> map = this.userKycDayLimitConfigs;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        HashMap<String, List<String>> map2 = this.payTypeCodeMap;
        int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        HashMap<String, List<String>> map3 = this.payTypeIdMap;
        int iHashCode8 = (((iHashCode7 + (map3 == null ? 0 : map3.hashCode())) * 31) + this.availableLegals.hashCode()) * 31;
        Boolean bool4 = this.signedPact;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.kycArea;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.kycName;
        return iHashCode10 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isCA() {
        return Intrinsics.areEqual(this.kycArea, "CA");
    }

    public final boolean isHighKycLevel() {
        return this.kycLevel == 2;
    }

    public final boolean isRealLowKycLevel() {
        return this.kycLevel == 1 && this.kyc;
    }

    public final boolean isSupportLegal(@NotNull String legal) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        return this.availableLegals.contains(legal);
    }

    public final boolean isSupportPayWay(@NotNull OtcInfoEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        for (String str : getSupportPayWay()) {
            Iterator it = C27024b.m66560c(item.getAdPayTypes()).iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(str, ((AdPayType) it.next()).getPayTypeCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isUS() {
        return Intrinsics.areEqual(this.kycArea, "US");
    }

    @NotNull
    public String toString() {
        return "OtcUserInfo(kycLevel=" + this.kycLevel + ", bindPhone=" + this.bindPhone + ", bindTradePassword=" + this.bindTradePassword + ", createdAt=" + this.createdAt + ", kyc=" + this.kyc + ", merchant=" + this.merchant + ", userKycDayLimitConfigs=" + this.userKycDayLimitConfigs + ", payTypeCodeMap=" + this.payTypeCodeMap + ", payTypeIdMap=" + this.payTypeIdMap + ", availableLegals=" + this.availableLegals + ", signedPact=" + this.signedPact + ", kycArea=" + this.kycArea + ", kycName=" + this.kycName + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.kycLevel);
        Boolean bool = this.bindPhone;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.bindTradePassword;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeInt(this.kyc ? 1 : 0);
        Boolean bool3 = this.merchant;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        HashMap<String, LimitDays> map = this.userKycDayLimitConfigs;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, LimitDays> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                entry.getValue().writeToParcel(dest, flags);
            }
        }
        HashMap<String, List<String>> map2 = this.payTypeCodeMap;
        if (map2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map2.size());
            for (Map.Entry<String, List<String>> entry2 : map2.entrySet()) {
                dest.writeString(entry2.getKey());
                dest.writeStringList(entry2.getValue());
            }
        }
        HashMap<String, List<String>> map3 = this.payTypeIdMap;
        if (map3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map3.size());
            for (Map.Entry<String, List<String>> entry3 : map3.entrySet()) {
                dest.writeString(entry3.getKey());
                dest.writeStringList(entry3.getValue());
            }
        }
        dest.writeStringList(this.availableLegals);
        Boolean bool4 = this.signedPact;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.kycArea);
        dest.writeString(this.kycName);
    }

    public /* synthetic */ OtcUserInfo(int i11, Boolean bool, Boolean bool2, Long l11, boolean z11, Boolean bool3, HashMap map, HashMap map2, HashMap map3, List list, Boolean bool4, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? Boolean.FALSE : bool, (i12 & 4) != 0 ? Boolean.FALSE : bool2, (i12 & 8) != 0 ? -1L : l11, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? Boolean.FALSE : bool3, (i12 & 64) != 0 ? new HashMap() : map, (i12 & 128) != 0 ? null : map2, (i12 & 256) != 0 ? null : map3, (i12 & 512) != 0 ? new ArrayList() : list, (i12 & 1024) != 0 ? Boolean.FALSE : bool4, (i12 & 2048) != 0 ? "" : str, (i12 & 4096) != 0 ? null : str2);
    }
}
