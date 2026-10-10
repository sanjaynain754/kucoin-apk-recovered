package com.kubi.core.base.p076ui;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImportTipDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bb\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J&\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bHÆ\u0003Jn\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R.\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m90084d2 = {"Lcom/kubi/core/base/ui/ImportInfoDisplayData;", "", "dialogTag", "", "title", "content", "confirmStr", "supportNotShowAnyMore", "", "moreJumpUrl", "confirmCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isNotShowAnyMore", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDialogTag", "()Ljava/lang/String;", "getTitle", "getContent", "getConfirmStr", "getSupportNotShowAnyMore", "()Z", "getMoreJumpUrl", "getConfirmCallback", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ImportInfoDisplayData {

    @Nullable
    private final Function1<Boolean, Unit> confirmCallback;

    @NotNull
    private final String confirmStr;

    @NotNull
    private final String content;

    @NotNull
    private final String dialogTag;

    @Nullable
    private final String moreJumpUrl;
    private final boolean supportNotShowAnyMore;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ImportInfoDisplayData(@NotNull String dialogTag, @NotNull String title, @NotNull String content, @NotNull String confirmStr, boolean z11, @Nullable String str, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(dialogTag, "dialogTag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(confirmStr, "confirmStr");
        this.dialogTag = dialogTag;
        this.title = title;
        this.content = content;
        this.confirmStr = confirmStr;
        this.supportNotShowAnyMore = z11;
        this.moreJumpUrl = str;
        this.confirmCallback = function1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImportInfoDisplayData)) {
            return false;
        }
        ImportInfoDisplayData importInfoDisplayData = (ImportInfoDisplayData) other;
        return Intrinsics.areEqual(this.dialogTag, importInfoDisplayData.dialogTag) && Intrinsics.areEqual(this.title, importInfoDisplayData.title) && Intrinsics.areEqual(this.content, importInfoDisplayData.content) && Intrinsics.areEqual(this.confirmStr, importInfoDisplayData.confirmStr) && this.supportNotShowAnyMore == importInfoDisplayData.supportNotShowAnyMore && Intrinsics.areEqual(this.moreJumpUrl, importInfoDisplayData.moreJumpUrl) && Intrinsics.areEqual(this.confirmCallback, importInfoDisplayData.confirmCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImportInfoDisplayData copy$default(ImportInfoDisplayData importInfoDisplayData, String str, String str2, String str3, String str4, boolean z11, String str5, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = importInfoDisplayData.dialogTag;
        }
        if ((i11 & 2) != 0) {
            str2 = importInfoDisplayData.title;
        }
        if ((i11 & 4) != 0) {
            str3 = importInfoDisplayData.content;
        }
        if ((i11 & 8) != 0) {
            str4 = importInfoDisplayData.confirmStr;
        }
        if ((i11 & 16) != 0) {
            z11 = importInfoDisplayData.supportNotShowAnyMore;
        }
        if ((i11 & 32) != 0) {
            str5 = importInfoDisplayData.moreJumpUrl;
        }
        if ((i11 & 64) != 0) {
            function1 = importInfoDisplayData.confirmCallback;
        }
        String str6 = str5;
        Function1 function2 = function1;
        boolean z12 = z11;
        String str7 = str3;
        return importInfoDisplayData.copy(str, str2, str7, str4, z12, str6, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDialogTag() {
        return this.dialogTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConfirmStr() {
        return this.confirmStr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSupportNotShowAnyMore() {
        return this.supportNotShowAnyMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMoreJumpUrl() {
        return this.moreJumpUrl;
    }

    @Nullable
    public final Function1<Boolean, Unit> component7() {
        return this.confirmCallback;
    }

    @NotNull
    public final ImportInfoDisplayData copy(@NotNull String dialogTag, @NotNull String title, @NotNull String content, @NotNull String confirmStr, boolean supportNotShowAnyMore, @Nullable String moreJumpUrl, @Nullable Function1<? super Boolean, Unit> confirmCallback) {
        Intrinsics.checkNotNullParameter(dialogTag, "dialogTag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(confirmStr, "confirmStr");
        return new ImportInfoDisplayData(dialogTag, title, content, confirmStr, supportNotShowAnyMore, moreJumpUrl, confirmCallback);
    }

    @Nullable
    public final Function1<Boolean, Unit> getConfirmCallback() {
        return this.confirmCallback;
    }

    @NotNull
    public final String getConfirmStr() {
        return this.confirmStr;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getDialogTag() {
        return this.dialogTag;
    }

    @Nullable
    public final String getMoreJumpUrl() {
        return this.moreJumpUrl;
    }

    public final boolean getSupportNotShowAnyMore() {
        return this.supportNotShowAnyMore;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.dialogTag.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.confirmStr.hashCode()) * 31) + Boolean.hashCode(this.supportNotShowAnyMore)) * 31;
        String str = this.moreJumpUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function1<Boolean, Unit> function1 = this.confirmCallback;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ImportInfoDisplayData(dialogTag=" + this.dialogTag + ", title=" + this.title + ", content=" + this.content + ", confirmStr=" + this.confirmStr + ", supportNotShowAnyMore=" + this.supportNotShowAnyMore + ", moreJumpUrl=" + this.moreJumpUrl + ", confirmCallback=" + this.confirmCallback + ')';
    }

    public /* synthetic */ ImportInfoDisplayData(String str, String str2, String str3, String str4, boolean z11, String str5, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z11, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : function1);
    }
}
