package com.kubi.sdk.function.language.dynamic.client;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.client.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/FetchResult;", "", "<init>", "()V", "Success", "Failure", "Lcom/kubi/sdk/function/language/dynamic/client/FetchResult$Failure;", "Lcom/kubi/sdk/function/language/dynamic/client/FetchResult$Success;", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FetchResult {

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.client.a$a, reason: from toString */
    /* JADX INFO: compiled from: RemoteConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/FetchResult$Failure;", "Lcom/kubi/sdk/function/language/dynamic/client/FetchResult;", "errorMsg", "", "<init>", "(Ljava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Failure extends FetchResult {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String errorMsg;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.errorMsg, ((Failure) other).errorMsg);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull String errorMsg) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
            this.errorMsg = errorMsg;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return this.errorMsg.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(errorMsg=" + this.errorMsg + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.client.a$b, reason: from toString */
    /* JADX INFO: compiled from: RemoteConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/FetchResult$Success;", "Lcom/kubi/sdk/function/language/dynamic/client/FetchResult;", "translations", "", "", "etag", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getTranslations", "()Ljava/util/Map;", "getEtag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Success extends FetchResult {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final Map<String, String> translations;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String etag;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.translations, success.translations) && Intrinsics.areEqual(this.etag, success.etag);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull Map<String, String> translations, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(translations, "translations");
            this.translations = translations;
            this.etag = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEtag() {
            return this.etag;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, String> m57033b() {
            return this.translations;
        }

        public int hashCode() {
            int iHashCode = this.translations.hashCode() * 31;
            String str = this.etag;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Success(translations=" + this.translations + ", etag=" + this.etag + ')';
        }
    }

    public /* synthetic */ FetchResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public FetchResult() {
    }
}
