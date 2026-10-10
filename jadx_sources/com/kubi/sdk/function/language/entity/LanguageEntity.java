package com.kubi.sdk.function.language.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LanguageEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/function/language/entity/LanguageEntity;", "", "type", "", "name", "isDefault", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getName", "setName", "()Ljava/lang/Boolean;", "setDefault", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LanguageEntity {

    @Nullable
    private Boolean isDefault;

    @Nullable
    private String name;

    @Nullable
    private String type;

    public LanguageEntity() {
        this(null, null, null, 7, null);
    }

    public LanguageEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.type = str;
        this.name = str2;
        this.isDefault = bool;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: isDefault, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    public final void setDefault(@Nullable Boolean bool) {
        this.isDefault = bool;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public /* synthetic */ LanguageEntity(String str, String str2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? Boolean.FALSE : bool);
    }
}
