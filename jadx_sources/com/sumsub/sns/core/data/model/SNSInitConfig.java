package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41876r2;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBE\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00060"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "", "", "email", HintConstants.AUTOFILL_HINT_PHONE, "", "strings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/r2;)V", "self", "Lwg0/b;", "output", "Lvg0/f;", "serialDesc", "", "write$Self$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/data/model/SNSInitConfig;Lwg0/b;Lvg0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "getPhone", "getPhone$annotations", "Ljava/util/Map;", "getStrings", "getStrings$annotations", "Companion", "$serializer", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public final /* data */ class SNSInitConfig {

    @Nullable
    private final String email;

    @Nullable
    private final String phone;

    @Nullable
    private final Map<String, String> strings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final Lazy<InterfaceC44951d<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.core.data.model.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSInitConfig._childSerializers$_anonymous_();
        }
    })};

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSInitConfig$Companion;", "", "<init>", "()V", "Ltg0/d;", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "serializer", "()Ltg0/d;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC44951d<SNSInitConfig> serializer() {
            return SNSInitConfig$$serializer.INSTANCE;
        }
    }

    public SNSInitConfig() {
        this((String) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSInitConfig)) {
            return false;
        }
        SNSInitConfig sNSInitConfig = (SNSInitConfig) other;
        return Intrinsics.areEqual(this.email, sNSInitConfig.email) && Intrinsics.areEqual(this.phone, sNSInitConfig.phone) && Intrinsics.areEqual(this.strings, sNSInitConfig.strings);
    }

    public /* synthetic */ SNSInitConfig(int i11, String str, String str2, Map map, C41876r2 c41876r2) {
        if ((i11 & 1) == 0) {
            this.email = null;
        } else {
            this.email = str;
        }
        if ((i11 & 2) == 0) {
            this.phone = null;
        } else {
            this.phone = str2;
        }
        if ((i11 & 4) == 0) {
            this.strings = null;
        } else {
            this.strings = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _childSerializers$_anonymous_() {
        C41897w2 c41897w2 = C41897w2.f92051a;
        return new C41790a1(c41897w2, c41897w2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SNSInitConfig copy$default(SNSInitConfig sNSInitConfig, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sNSInitConfig.email;
        }
        if ((i11 & 2) != 0) {
            str2 = sNSInitConfig.phone;
        }
        if ((i11 & 4) != 0) {
            map = sNSInitConfig.strings;
        }
        return sNSInitConfig.copy(str, str2, map);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$idensic_mobile_sdk_aar_defaultRelease(SNSInitConfig self, InterfaceC45829b output, InterfaceC45533f serialDesc) {
        Lazy<InterfaceC44951d<Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.email != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, C41897w2.f92051a, self.email);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.phone != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C41897w2.f92051a, self.phone);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.strings == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.strings);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.strings;
    }

    @NotNull
    public final SNSInitConfig copy(@Nullable String email, @Nullable String phone, @Nullable Map<String, String> strings) {
        return new SNSInitConfig(email, phone, strings);
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Map<String, String> getStrings() {
        return this.strings;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.strings;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SNSInitConfig(email=" + this.email + ", phone=" + this.phone + ", strings=" + this.strings + ")";
    }

    public SNSInitConfig(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        this.email = str;
        this.phone = str2;
        this.strings = map;
    }

    public /* synthetic */ SNSInitConfig(String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : map);
    }

    public static /* synthetic */ void getEmail$annotations() {
    }

    public static /* synthetic */ void getPhone$annotations() {
    }

    public static /* synthetic */ void getStrings$annotations() {
    }
}
