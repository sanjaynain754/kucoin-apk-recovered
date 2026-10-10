package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.blankj.utilcode.util.C5288p;
import com.google.gson.reflect.TypeToken;
import com.kubi.kyc.KycKey;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\bU\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u009b\u00012\u00020\u0001:\u0002\u009b\u0001Bë\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u0006\u0010T\u001a\u00020\u000fJ\u0006\u0010U\u001a\u00020\u000fJ\u0006\u0010V\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\u000fJ\u0006\u0010X\u001a\u00020\u000fJ\u0006\u0010Y\u001a\u00020\u000fJ\u0006\u0010Z\u001a\u00020\u000fJ\u0006\u0010[\u001a\u00020\u000fJ\u0006\u0010\\\u001a\u00020\u000fJ\u0006\u0010]\u001a\u00020\u000fJ\u0006\u0010^\u001a\u00020\u000fJ\u0006\u0010_\u001a\u00020\u000fJ\u0006\u0010`\u001a\u00020\u000fJ\u0006\u0010a\u001a\u00020\u000fJ\u0006\u0010b\u001a\u00020\u000fJ\u0006\u0010c\u001a\u00020\u000fJ\u0006\u0010d\u001a\u00020\u000fJ\u0006\u0010e\u001a\u00020\u000fJ\u0006\u0010f\u001a\u00020\u000fJ\u0006\u0010g\u001a\u00020\u000fJ\u0006\u0010h\u001a\u00020\u000fJ\u0006\u0010i\u001a\u00020\u000fJ\u0006\u0010j\u001a\u00020\u000fJ\u0006\u0010k\u001a\u00020\u000fJ\u0006\u0010l\u001a\u00020\u0007J\u0006\u0010m\u001a\u00020\u0007J\u0006\u0010n\u001a\u00020\u000fJ\u0016\u0010o\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010q\u0018\u00010pJ0\u0010r\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070sj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007`t2\b\u0010u\u001a\u0004\u0018\u00010\u0000J\u0006\u0010v\u001a\u00020\u0007J\u0006\u0010w\u001a\u00020\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010{\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00108J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00108J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00108J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00108J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aHÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u009e\u0002\u0010\u008e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u008f\u0001J\u0007\u0010\u0090\u0001\u001a\u00020\u0003J\u0016\u0010\u0091\u0001\u001a\u00020\u000f2\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001HÖ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0095\u0001\u001a\u00020\u0007HÖ\u0001J\u001b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b\u000e\u00108\"\u0004\b9\u0010:R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b>\u00108\"\u0004\b?\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bB\u0010 \"\u0004\bC\u0010\"R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bD\u0010 \"\u0004\bE\u0010\"R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bF\u0010 \"\u0004\bG\u0010\"R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bH\u0010 \"\u0004\bI\u0010\"R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\bJ\u00108\"\u0004\bK\u0010:R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010)\"\u0004\bM\u0010+R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bR\u0010 \"\u0004\bS\u0010\"¨\u0006\u009c\u0001"}, m90084d2 = {"Lcom/kubi/kyc/api/KycInfoEntity;", "Landroid/os/Parcelable;", "regionType", "", "intermediateVerifyStatus", "type", KycKey.firstName, "", KycKey.lastName, "regionCode", "identityType", "identityNumber", "companyName", HintConstants.AUTOFILL_HINT_PHONE, "isPhoneCredible", "", "canSubmitPrimaryKyc", "canSubmitFaceKyc", "failureReason", "verifyType", "primaryVerifyStatus", "verifyStatus", "ekycFailTimes", "showManualEntrance", "waitingPage", "failureReasonLists", "", "lastVerifyStatus", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "()V", "getRegionType", "()Ljava/lang/Integer;", "setRegionType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIntermediateVerifyStatus", "setIntermediateVerifyStatus", "getType", "setType", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getLastName", "setLastName", "getRegionCode", "setRegionCode", "getIdentityType", "setIdentityType", "getIdentityNumber", "setIdentityNumber", "getCompanyName", "setCompanyName", "getPhone", "setPhone", "()Ljava/lang/Boolean;", "setPhoneCredible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCanSubmitPrimaryKyc", "setCanSubmitPrimaryKyc", "getCanSubmitFaceKyc", "setCanSubmitFaceKyc", "getFailureReason", "setFailureReason", "getVerifyType", "setVerifyType", "getPrimaryVerifyStatus", "setPrimaryVerifyStatus", "getVerifyStatus", "setVerifyStatus", "getEkycFailTimes", "setEkycFailTimes", "getShowManualEntrance", "setShowManualEntrance", "getWaitingPage", "setWaitingPage", "getFailureReasonLists", "()Ljava/util/List;", "setFailureReasonLists", "(Ljava/util/List;)V", "getLastVerifyStatus", "setLastVerifyStatus", "isWait", "isFirst", "isOrg", "isSenior", "isPersonPrimarySuccess", "isPersonPrimarySuccessOnly", "isPersonPrimaryFail", "isPersonReview", "isPersonReviewByJumio", "isConfirmReplace", "isPersonSuccess", "isPersonFail", "isPersonFailWithFace", "isPersonFailWithCard", "isPersonSeniorFail", "isPersonForbid", "isOrgReview", "isOrgSuccess", "isOrgFail", "isPhoneSuccess", "cannotID", "canID", "cannotFace", "canFace", "btnText", "labelText", "isChina", "reasonMap", "", "Lcom/kubi/kyc/api/KycReasonEntity;", "toPrimaryMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "origin", "getKycLevel", "kycLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/kubi/kyc/api/KycInfoEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycInfoEntity implements Parcelable {
    public static final int KYC_LEVEL0 = 0;
    public static final int KYC_LEVEL1 = 1;
    public static final int KYC_LEVEL2 = 2;
    public static final int KYC_LEVEL3 = 3;

    @Nullable
    private Boolean canSubmitFaceKyc;

    @Nullable
    private Boolean canSubmitPrimaryKyc;

    @Nullable
    private String companyName;

    @Nullable
    private Integer ekycFailTimes;

    @Nullable
    private String failureReason;

    @Nullable
    private List<String> failureReasonLists;

    @Nullable
    private String firstName;

    @Nullable
    private String identityNumber;

    @Nullable
    private String identityType;

    @Nullable
    private Integer intermediateVerifyStatus;

    @Nullable
    private Boolean isPhoneCredible;

    @Nullable
    private String lastName;

    @Nullable
    private Integer lastVerifyStatus;

    @Nullable
    private String phone;

    @Nullable
    private Integer primaryVerifyStatus;

    @Nullable
    private String regionCode;

    @Nullable
    private Integer regionType;

    @Nullable
    private Boolean showManualEntrance;

    @Nullable
    private Integer type;

    @Nullable
    private Integer verifyStatus;

    @Nullable
    private Integer verifyType;

    @Nullable
    private String waitingPage;

    @NotNull
    public static final Parcelable.Creator<KycInfoEntity> CREATOR = new C17090a();

    /* JADX INFO: renamed from: com.kubi.kyc.api.KycInfoEntity$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17090a implements Parcelable.Creator<KycInfoEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KycInfoEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = boolValueOf2;
            String string8 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new KycInfoEntity(numValueOf, numValueOf2, numValueOf3, string, string2, string3, string4, string5, string6, string7, boolValueOf, bool, boolValueOf3, string8, numValueOf4, numValueOf5, numValueOf6, numValueOf7, boolValueOf4, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KycInfoEntity[] newArray(int i11) {
            return new KycInfoEntity[i11];
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.api.KycInfoEntity$b */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/kyc/api/KycInfoEntity$reasonMap$1$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "Lcom/kubi/kyc/api/KycReasonEntity;", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17091b extends TypeToken<Map<String, ? extends KycReasonEntity>> {
    }

    public KycInfoEntity(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str8, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Boolean bool4, @Nullable String str9, @Nullable List<String> list, @Nullable Integer num8) {
        this.regionType = num;
        this.intermediateVerifyStatus = num2;
        this.type = num3;
        this.firstName = str;
        this.lastName = str2;
        this.regionCode = str3;
        this.identityType = str4;
        this.identityNumber = str5;
        this.companyName = str6;
        this.phone = str7;
        this.isPhoneCredible = bool;
        this.canSubmitPrimaryKyc = bool2;
        this.canSubmitFaceKyc = bool3;
        this.failureReason = str8;
        this.verifyType = num4;
        this.primaryVerifyStatus = num5;
        this.verifyStatus = num6;
        this.ekycFailTimes = num7;
        this.showManualEntrance = bool4;
        this.waitingPage = str9;
        this.failureReasonLists = list;
        this.lastVerifyStatus = num8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycInfoEntity copy$default(KycInfoEntity kycInfoEntity, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool4, String str9, List list, Integer num8, int i11, Object obj) {
        Integer num9;
        List list2;
        Integer num10 = (i11 & 1) != 0 ? kycInfoEntity.regionType : num;
        Integer num11 = (i11 & 2) != 0 ? kycInfoEntity.intermediateVerifyStatus : num2;
        Integer num12 = (i11 & 4) != 0 ? kycInfoEntity.type : num3;
        String str10 = (i11 & 8) != 0 ? kycInfoEntity.firstName : str;
        String str11 = (i11 & 16) != 0 ? kycInfoEntity.lastName : str2;
        String str12 = (i11 & 32) != 0 ? kycInfoEntity.regionCode : str3;
        String str13 = (i11 & 64) != 0 ? kycInfoEntity.identityType : str4;
        String str14 = (i11 & 128) != 0 ? kycInfoEntity.identityNumber : str5;
        String str15 = (i11 & 256) != 0 ? kycInfoEntity.companyName : str6;
        String str16 = (i11 & 512) != 0 ? kycInfoEntity.phone : str7;
        Boolean bool5 = (i11 & 1024) != 0 ? kycInfoEntity.isPhoneCredible : bool;
        Boolean bool6 = (i11 & 2048) != 0 ? kycInfoEntity.canSubmitPrimaryKyc : bool2;
        Boolean bool7 = (i11 & 4096) != 0 ? kycInfoEntity.canSubmitFaceKyc : bool3;
        String str17 = (i11 & 8192) != 0 ? kycInfoEntity.failureReason : str8;
        Integer num13 = num10;
        Integer num14 = (i11 & 16384) != 0 ? kycInfoEntity.verifyType : num4;
        Integer num15 = (i11 & 32768) != 0 ? kycInfoEntity.primaryVerifyStatus : num5;
        Integer num16 = (i11 & 65536) != 0 ? kycInfoEntity.verifyStatus : num6;
        Integer num17 = (i11 & 131072) != 0 ? kycInfoEntity.ekycFailTimes : num7;
        Boolean bool8 = (i11 & 262144) != 0 ? kycInfoEntity.showManualEntrance : bool4;
        String str18 = (i11 & 524288) != 0 ? kycInfoEntity.waitingPage : str9;
        List list3 = (i11 & 1048576) != 0 ? kycInfoEntity.failureReasonLists : list;
        if ((i11 & 2097152) != 0) {
            list2 = list3;
            num9 = kycInfoEntity.lastVerifyStatus;
        } else {
            num9 = num8;
            list2 = list3;
        }
        return kycInfoEntity.copy(num13, num11, num12, str10, str11, str12, str13, str14, str15, str16, bool5, bool6, bool7, str17, num14, num15, num16, num17, bool8, str18, list2, num9);
    }

    @NotNull
    public final KycInfoEntity copy(@Nullable Integer regionType, @Nullable Integer intermediateVerifyStatus, @Nullable Integer type, @Nullable String firstName, @Nullable String lastName, @Nullable String regionCode, @Nullable String identityType, @Nullable String identityNumber, @Nullable String companyName, @Nullable String phone, @Nullable Boolean isPhoneCredible, @Nullable Boolean canSubmitPrimaryKyc, @Nullable Boolean canSubmitFaceKyc, @Nullable String failureReason, @Nullable Integer verifyType, @Nullable Integer primaryVerifyStatus, @Nullable Integer verifyStatus, @Nullable Integer ekycFailTimes, @Nullable Boolean showManualEntrance, @Nullable String waitingPage, @Nullable List<String> failureReasonLists, @Nullable Integer lastVerifyStatus) {
        return new KycInfoEntity(regionType, intermediateVerifyStatus, type, firstName, lastName, regionCode, identityType, identityNumber, companyName, phone, isPhoneCredible, canSubmitPrimaryKyc, canSubmitFaceKyc, failureReason, verifyType, primaryVerifyStatus, verifyStatus, ekycFailTimes, showManualEntrance, waitingPage, failureReasonLists, lastVerifyStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycInfoEntity)) {
            return false;
        }
        KycInfoEntity kycInfoEntity = (KycInfoEntity) other;
        return Intrinsics.areEqual(this.regionType, kycInfoEntity.regionType) && Intrinsics.areEqual(this.intermediateVerifyStatus, kycInfoEntity.intermediateVerifyStatus) && Intrinsics.areEqual(this.type, kycInfoEntity.type) && Intrinsics.areEqual(this.firstName, kycInfoEntity.firstName) && Intrinsics.areEqual(this.lastName, kycInfoEntity.lastName) && Intrinsics.areEqual(this.regionCode, kycInfoEntity.regionCode) && Intrinsics.areEqual(this.identityType, kycInfoEntity.identityType) && Intrinsics.areEqual(this.identityNumber, kycInfoEntity.identityNumber) && Intrinsics.areEqual(this.companyName, kycInfoEntity.companyName) && Intrinsics.areEqual(this.phone, kycInfoEntity.phone) && Intrinsics.areEqual(this.isPhoneCredible, kycInfoEntity.isPhoneCredible) && Intrinsics.areEqual(this.canSubmitPrimaryKyc, kycInfoEntity.canSubmitPrimaryKyc) && Intrinsics.areEqual(this.canSubmitFaceKyc, kycInfoEntity.canSubmitFaceKyc) && Intrinsics.areEqual(this.failureReason, kycInfoEntity.failureReason) && Intrinsics.areEqual(this.verifyType, kycInfoEntity.verifyType) && Intrinsics.areEqual(this.primaryVerifyStatus, kycInfoEntity.primaryVerifyStatus) && Intrinsics.areEqual(this.verifyStatus, kycInfoEntity.verifyStatus) && Intrinsics.areEqual(this.ekycFailTimes, kycInfoEntity.ekycFailTimes) && Intrinsics.areEqual(this.showManualEntrance, kycInfoEntity.showManualEntrance) && Intrinsics.areEqual(this.waitingPage, kycInfoEntity.waitingPage) && Intrinsics.areEqual(this.failureReasonLists, kycInfoEntity.failureReasonLists) && Intrinsics.areEqual(this.lastVerifyStatus, kycInfoEntity.lastVerifyStatus);
    }

    public int hashCode() {
        Integer num = this.regionType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.intermediateVerifyStatus;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.type;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.firstName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionCode;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.identityType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.identityNumber;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.companyName;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phone;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isPhoneCredible;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canSubmitPrimaryKyc;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canSubmitFaceKyc;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.failureReason;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.verifyType;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.primaryVerifyStatus;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.verifyStatus;
        int iHashCode17 = (iHashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.ekycFailTimes;
        int iHashCode18 = (iHashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool4 = this.showManualEntrance;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str9 = this.waitingPage;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.failureReasonLists;
        int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num8 = this.lastVerifyStatus;
        return iHashCode21 + (num8 != null ? num8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycInfoEntity(regionType=" + this.regionType + ", intermediateVerifyStatus=" + this.intermediateVerifyStatus + ", type=" + this.type + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", regionCode=" + this.regionCode + ", identityType=" + this.identityType + ", identityNumber=" + this.identityNumber + ", companyName=" + this.companyName + ", phone=" + this.phone + ", isPhoneCredible=" + this.isPhoneCredible + ", canSubmitPrimaryKyc=" + this.canSubmitPrimaryKyc + ", canSubmitFaceKyc=" + this.canSubmitFaceKyc + ", failureReason=" + this.failureReason + ", verifyType=" + this.verifyType + ", primaryVerifyStatus=" + this.primaryVerifyStatus + ", verifyStatus=" + this.verifyStatus + ", ekycFailTimes=" + this.ekycFailTimes + ", showManualEntrance=" + this.showManualEntrance + ", waitingPage=" + this.waitingPage + ", failureReasonLists=" + this.failureReasonLists + ", lastVerifyStatus=" + this.lastVerifyStatus + ')';
    }

    public final boolean canFace() {
        Integer num;
        return C27025c.m66566d(this.canSubmitFaceKyc) && (num = this.verifyType) != null && num.intValue() == 1;
    }

    public final boolean canID() {
        Integer num;
        Integer num2;
        Integer num3;
        return C27025c.m66566d(this.canSubmitPrimaryKyc) && (num = this.type) != null && num.intValue() == 0 && (num2 = this.primaryVerifyStatus) != null && num2.intValue() == 0 && (num3 = this.verifyStatus) != null && num3.intValue() == -1;
    }

    public final boolean cannotFace() {
        Integer num;
        return (C27025c.m66566d(this.canSubmitFaceKyc) || (num = this.verifyType) == null || num.intValue() != 1) ? false : true;
    }

    public final boolean cannotID() {
        Integer num;
        Integer num2;
        Integer num3;
        return (C27025c.m66566d(this.canSubmitPrimaryKyc) || (num = this.type) == null || num.intValue() != 0 || (num2 = this.primaryVerifyStatus) == null || num2.intValue() != 0 || (num3 = this.verifyStatus) == null || num3.intValue() != -1) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRegionType() {
        return this.regionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getIsPhoneCredible() {
        return this.isPhoneCredible;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getCanSubmitPrimaryKyc() {
        return this.canSubmitPrimaryKyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getCanSubmitFaceKyc() {
        return this.canSubmitFaceKyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getVerifyType() {
        return this.verifyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getPrimaryVerifyStatus() {
        return this.primaryVerifyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getEkycFailTimes() {
        return this.ekycFailTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getShowManualEntrance() {
        return this.showManualEntrance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIntermediateVerifyStatus() {
        return this.intermediateVerifyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getWaitingPage() {
        return this.waitingPage;
    }

    @Nullable
    public final List<String> component21() {
        return this.failureReasonLists;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getLastVerifyStatus() {
        return this.lastVerifyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    public final Boolean getCanSubmitFaceKyc() {
        return this.canSubmitFaceKyc;
    }

    @Nullable
    public final Boolean getCanSubmitPrimaryKyc() {
        return this.canSubmitPrimaryKyc;
    }

    @Nullable
    public final String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    public final Integer getEkycFailTimes() {
        return this.ekycFailTimes;
    }

    @Nullable
    public final String getFailureReason() {
        return this.failureReason;
    }

    @Nullable
    public final List<String> getFailureReasonLists() {
        return this.failureReasonLists;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    public final Integer getIntermediateVerifyStatus() {
        return this.intermediateVerifyStatus;
    }

    @NotNull
    public final String getKycLevel() {
        Integer num = this.primaryVerifyStatus;
        if (num != null && num.intValue() == 0) {
            return "KYC0";
        }
        Integer num2 = this.primaryVerifyStatus;
        if (num2 == null || num2.intValue() != 1) {
            return "KYC2";
        }
        Integer num3 = this.verifyStatus;
        if (num3 != null && num3.intValue() == 1) {
            return "KYC2";
        }
        Integer num4 = this.verifyStatus;
        return (num4 != null && num4.intValue() == 5) ? "KYC2" : "KYC1";
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final Integer getLastVerifyStatus() {
        return this.lastVerifyStatus;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Integer getPrimaryVerifyStatus() {
        return this.primaryVerifyStatus;
    }

    @Nullable
    public final String getRegionCode() {
        return this.regionCode;
    }

    @Nullable
    public final Integer getRegionType() {
        return this.regionType;
    }

    @Nullable
    public final Boolean getShowManualEntrance() {
        return this.showManualEntrance;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    @Nullable
    public final Integer getVerifyType() {
        return this.verifyType;
    }

    @Nullable
    public final String getWaitingPage() {
        return this.waitingPage;
    }

    public final boolean isChina() {
        return Intrinsics.areEqual(this.regionCode, "CN");
    }

    public final boolean isConfirmReplace() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == 0 && (num = this.verifyStatus) != null && num.intValue() == 0 && Intrinsics.areEqual(C27041f.m66668h(this.waitingPage), "JUMIO_REPLACE_KYC1");
    }

    public final boolean isFirst() {
        Integer num = this.type;
        return num != null && num.intValue() == -1;
    }

    public final boolean isOrg() {
        Integer num = this.type;
        return num != null && num.intValue() == 1;
    }

    public final boolean isOrgFail() {
        Integer num;
        Integer num2 = this.type;
        if (num2 == null || num2.intValue() != 1) {
            return false;
        }
        Integer num3 = this.verifyStatus;
        return (num3 != null && num3.intValue() == 2) || ((num = this.verifyStatus) != null && num.intValue() == 4);
    }

    public final boolean isOrgReview() {
        Integer num;
        Integer num2 = this.type;
        if (num2 == null || num2.intValue() != 1) {
            return false;
        }
        Integer num3 = this.verifyStatus;
        return (num3 != null && num3.intValue() == 0) || ((num = this.verifyStatus) != null && num.intValue() == 3);
    }

    public final boolean isOrgSuccess() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == 1 && (num = this.verifyStatus) != null && num.intValue() == 1;
    }

    public final boolean isPersonFail() {
        Integer num = this.type;
        if (num == null || num.intValue() != 0) {
            return false;
        }
        Integer num2 = this.verifyStatus;
        if (num2 != null && num2.intValue() == 2) {
            return true;
        }
        Integer num3 = this.verifyStatus;
        return num3 != null && num3.intValue() == 4;
    }

    public final boolean isPersonFailWithCard() {
        Integer num;
        Integer num2;
        Integer num3 = this.type;
        if (num3 == null || num3.intValue() != 0) {
            return false;
        }
        Integer num4 = this.verifyStatus;
        return ((num4 != null && num4.intValue() == 2) || ((num = this.verifyStatus) != null && num.intValue() == 4)) && (num2 = this.verifyType) != null && num2.intValue() == 0;
    }

    public final boolean isPersonFailWithFace() {
        Integer num;
        Integer num2;
        Integer num3 = this.type;
        if (num3 == null || num3.intValue() != 0) {
            return false;
        }
        Integer num4 = this.verifyStatus;
        return ((num4 != null && num4.intValue() == 2) || ((num = this.verifyStatus) != null && num.intValue() == 4)) && (num2 = this.verifyType) != null && num2.intValue() == 1;
    }

    public final boolean isPersonForbid() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == 0 && (num = this.verifyStatus) != null && num.intValue() == 5;
    }

    public final boolean isPersonPrimaryFail() {
        Integer num;
        Integer num2;
        Integer num3 = this.type;
        return num3 != null && num3.intValue() == 0 && (num = this.primaryVerifyStatus) != null && num.intValue() == 0 && (num2 = this.verifyStatus) != null && num2.intValue() == -1;
    }

    public final boolean isPersonPrimarySuccess() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == 0 && (num = this.primaryVerifyStatus) != null && num.intValue() == 1;
    }

    public final boolean isPersonPrimarySuccessOnly() {
        Integer num;
        Integer num2;
        Integer num3 = this.type;
        return num3 != null && num3.intValue() == 0 && (num = this.primaryVerifyStatus) != null && num.intValue() == 1 && (num2 = this.verifyStatus) != null && num2.intValue() == -1;
    }

    public final boolean isPersonReview() {
        Integer num;
        Integer num2 = this.type;
        if (num2 == null || num2.intValue() != 0) {
            return false;
        }
        Integer num3 = this.verifyStatus;
        if ((num3 != null && num3.intValue() == 0) || ((num = this.verifyStatus) != null && num.intValue() == 3)) {
            return (Intrinsics.areEqual(this.waitingPage, "JUMIO") && Intrinsics.areEqual(this.waitingPage, "JUMIO_REPLACE_KYC1")) ? false : true;
        }
        return false;
    }

    public final boolean isPersonReviewByJumio() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == 0 && (num = this.verifyStatus) != null && num.intValue() == 0 && Intrinsics.areEqual(C27041f.m66668h(this.waitingPage), "JUMIO");
    }

    public final boolean isPersonSeniorFail() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == 0 && (num = this.verifyStatus) != null && num.intValue() == 8;
    }

    public final boolean isPersonSuccess() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == 0 && (num = this.verifyStatus) != null && num.intValue() == 1;
    }

    @Nullable
    public final Boolean isPhoneCredible() {
        return this.isPhoneCredible;
    }

    public final boolean isPhoneSuccess() {
        Integer num;
        Integer num2 = this.type;
        return num2 != null && num2.intValue() == -1 && (num = this.primaryVerifyStatus) != null && num.intValue() == 0 && C27025c.m66566d(this.isPhoneCredible) && C27025c.m66566d(this.canSubmitPrimaryKyc);
    }

    public final boolean isSenior() {
        Integer num = this.type;
        if (num == null || num.intValue() != 0) {
            return false;
        }
        Integer num2 = this.verifyStatus;
        return num2 == null || num2.intValue() != -1;
    }

    public final boolean isWait() {
        Integer num = this.verifyStatus;
        if (num != null && num.intValue() == 7) {
            return true;
        }
        Integer num2 = this.verifyStatus;
        return num2 != null && num2.intValue() == 6;
    }

    public final int kycLevel() {
        Integer num = this.verifyStatus;
        if (num != null && num.intValue() == 1) {
            return 3;
        }
        Integer num2 = this.verifyStatus;
        if (num2 != null && num2.intValue() == 5) {
            return 1;
        }
        Integer num3 = this.intermediateVerifyStatus;
        if (num3 != null && num3.intValue() == 1) {
            return 2;
        }
        Integer num4 = this.primaryVerifyStatus;
        if (num4 != null && num4.intValue() == -1) {
            return 0;
        }
        Integer num5 = this.primaryVerifyStatus;
        return (num5 != null && num5.intValue() == 0) ? 0 : 1;
    }

    @Nullable
    public final Map<String, KycReasonEntity> reasonMap() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((Map) C5288p.m6343e(this.failureReason, new C17091b().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (Map) objM103844constructorimpl;
    }

    public final void setCanSubmitFaceKyc(@Nullable Boolean bool) {
        this.canSubmitFaceKyc = bool;
    }

    public final void setCanSubmitPrimaryKyc(@Nullable Boolean bool) {
        this.canSubmitPrimaryKyc = bool;
    }

    public final void setCompanyName(@Nullable String str) {
        this.companyName = str;
    }

    public final void setEkycFailTimes(@Nullable Integer num) {
        this.ekycFailTimes = num;
    }

    public final void setFailureReason(@Nullable String str) {
        this.failureReason = str;
    }

    public final void setFailureReasonLists(@Nullable List<String> list) {
        this.failureReasonLists = list;
    }

    public final void setFirstName(@Nullable String str) {
        this.firstName = str;
    }

    public final void setIdentityNumber(@Nullable String str) {
        this.identityNumber = str;
    }

    public final void setIdentityType(@Nullable String str) {
        this.identityType = str;
    }

    public final void setIntermediateVerifyStatus(@Nullable Integer num) {
        this.intermediateVerifyStatus = num;
    }

    public final void setLastName(@Nullable String str) {
        this.lastName = str;
    }

    public final void setLastVerifyStatus(@Nullable Integer num) {
        this.lastVerifyStatus = num;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setPhoneCredible(@Nullable Boolean bool) {
        this.isPhoneCredible = bool;
    }

    public final void setPrimaryVerifyStatus(@Nullable Integer num) {
        this.primaryVerifyStatus = num;
    }

    public final void setRegionCode(@Nullable String str) {
        this.regionCode = str;
    }

    public final void setRegionType(@Nullable Integer num) {
        this.regionType = num;
    }

    public final void setShowManualEntrance(@Nullable Boolean bool) {
        this.showManualEntrance = bool;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setVerifyStatus(@Nullable Integer num) {
        this.verifyStatus = num;
    }

    public final void setVerifyType(@Nullable Integer num) {
        this.verifyType = num;
    }

    public final void setWaitingPage(@Nullable String str) {
        this.waitingPage = str;
    }

    @NotNull
    public final HashMap<String, String> toPrimaryMap(@Nullable KycInfoEntity origin) {
        HashMap<String, String> map = new HashMap<>();
        if (Intrinsics.areEqual(this.regionCode, "CN")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(origin != null ? origin.lastName : null);
            sb2.append(origin != null ? origin.firstName : null);
            if (!Intrinsics.areEqual(sb2.toString(), this.lastName + this.firstName)) {
                map.put(KycKey.firstName, this.firstName);
                map.put(KycKey.lastName, this.lastName);
            }
        } else {
            if (!Intrinsics.areEqual(origin != null ? origin.firstName : null, this.firstName)) {
                map.put(KycKey.firstName, this.firstName);
            }
            if (!Intrinsics.areEqual(origin != null ? origin.lastName : null, this.lastName)) {
                map.put(KycKey.lastName, this.lastName);
            }
        }
        if (!Intrinsics.areEqual(origin != null ? origin.identityNumber : null, this.identityNumber)) {
            map.put("identityNumber", this.identityNumber);
        }
        map.put("identityType", this.identityType);
        map.put("regionCode", this.regionCode);
        return map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.regionType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.intermediateVerifyStatus;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.type;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.regionCode);
        dest.writeString(this.identityType);
        dest.writeString(this.identityNumber);
        dest.writeString(this.companyName);
        dest.writeString(this.phone);
        Boolean bool = this.isPhoneCredible;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.canSubmitPrimaryKyc;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.canSubmitFaceKyc;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.failureReason);
        Integer num4 = this.verifyType;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        Integer num5 = this.primaryVerifyStatus;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        Integer num6 = this.verifyStatus;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        Integer num7 = this.ekycFailTimes;
        if (num7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num7.intValue());
        }
        Boolean bool4 = this.showManualEntrance;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.waitingPage);
        dest.writeStringList(this.failureReasonLists);
        Integer num8 = this.lastVerifyStatus;
        if (num8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num8.intValue());
        }
    }

    @NotNull
    public final String btnText() {
        if (canFace()) {
            String string = BaseApplication.INSTANCE.get().getResources().getString(R$string.kyc_face_retry);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (cannotFace()) {
            String string2 = BaseApplication.INSTANCE.get().getResources().getString(R$string.kyc_replace_certificate);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = BaseApplication.INSTANCE.get().getResources().getString(R$string.kyc_face_retry);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    @NotNull
    public final String labelText() {
        if (!isPersonPrimarySuccessOnly() && !isPhoneSuccess()) {
            if (isOrgSuccess()) {
                String string = BaseApplication.INSTANCE.get().getResources().getString(R$string.kyc_success);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            String string2 = BaseApplication.INSTANCE.get().getResources().getString(R$string.kyc_complete_advanced);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = BaseApplication.INSTANCE.get().getResources().getString(R$string.kyc_complete_primary);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public /* synthetic */ KycInfoEntity(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool4, String str9, List list, Integer num8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, num3, str, str2, str3, str4, str5, str6, str7, bool, bool2, bool3, str8, num4, num5, num6, num7, bool4, str9, list, (i11 & 2097152) != 0 ? -1111 : num8);
    }

    public KycInfoEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097152, null);
    }
}
