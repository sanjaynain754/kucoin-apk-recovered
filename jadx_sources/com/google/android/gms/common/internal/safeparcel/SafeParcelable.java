package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes.dex */
public interface SafeParcelable extends Parcelable {

    @NonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface Class {
        @NonNull
        String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface Constructor {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface Field {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m12889id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface Indicator {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface Param {
        /* JADX INFO: renamed from: id */
        int m12890id();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface RemovedParam {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m12891id();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface Reserved {
        @NonNull
        int[] value();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* JADX INFO: loaded from: classes45.dex */
    public @interface VersionField {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m12892id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
