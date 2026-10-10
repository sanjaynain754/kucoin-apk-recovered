package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public abstract class ResponseData extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public abstract JSONObject toJsonObject();
}
