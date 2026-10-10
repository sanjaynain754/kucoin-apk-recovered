package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.model.StaticModel;
import jumio.core.AbstractC40629Z3;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/jumio/core/models/UploadSettingsModel;", "Lcom/jumio/core/model/StaticModel;", "requestedImageResolution", "Lcom/jumio/core/enums/UploadResolution;", "uploadImageResolution", "<init>", "(Lcom/jumio/core/enums/UploadResolution;Lcom/jumio/core/enums/UploadResolution;)V", "getRequestedImageResolution", "()Lcom/jumio/core/enums/UploadResolution;", "getUploadImageResolution", "setUploadImageResolution", "(Lcom/jumio/core/enums/UploadResolution;)V", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("UploadSettingsModel")
public final class UploadSettingsModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final UploadResolution f14380a;

    /* JADX INFO: renamed from: b */
    public UploadResolution f14381b;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/UploadSettingsModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/UploadSettingsModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final UploadSettingsModel fromJson(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            UploadResolution.Companion companion = UploadResolution.INSTANCE;
            String strOptString = jsonObject.optString("uploadImageResolution");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            UploadResolution uploadResolutionFromString = companion.fromString(strOptString);
            return new UploadSettingsModel(uploadResolutionFromString, uploadResolutionFromString);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UploadSettingsModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UploadSettingsModel(UploadResolution uploadResolution, UploadResolution uploadResolution2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? AbstractC40629Z3.f90200a : uploadResolution, (i11 & 2) != 0 ? AbstractC40629Z3.f90200a : uploadResolution2);
    }

    @NotNull
    /* JADX INFO: renamed from: getRequestedImageResolution, reason: from getter */
    public final UploadResolution getF14380a() {
        return this.f14380a;
    }

    @NotNull
    /* JADX INFO: renamed from: getUploadImageResolution, reason: from getter */
    public final UploadResolution getF14381b() {
        return this.f14381b;
    }

    public final void setUploadImageResolution(@NotNull UploadResolution uploadResolution) {
        Intrinsics.checkNotNullParameter(uploadResolution, "<set-?>");
        this.f14381b = uploadResolution;
    }

    public UploadSettingsModel(@NotNull UploadResolution requestedImageResolution, @NotNull UploadResolution uploadImageResolution) {
        Intrinsics.checkNotNullParameter(requestedImageResolution, "requestedImageResolution");
        Intrinsics.checkNotNullParameter(uploadImageResolution, "uploadImageResolution");
        this.f14380a = requestedImageResolution;
        this.f14381b = uploadImageResolution;
    }
}
