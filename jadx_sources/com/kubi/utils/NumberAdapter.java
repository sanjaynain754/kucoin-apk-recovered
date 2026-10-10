package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.kubi.utils.exception.GsonCode;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import v70.C45463a;

/* JADX INFO: compiled from: GsonUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\"\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/utils/NumberAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "Lcom/google/gson/JsonElement;", JPushConstants.Analysis.KEY_JSON, "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;", "", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/Object;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
abstract class NumberAdapter<T> implements JsonDeserializer<T> {
    /* JADX INFO: renamed from: a */
    public abstract T mo66363a(@NotNull String value);

    @Override // com.google.gson.JsonDeserializer
    @Nullable
    public T deserialize(@Nullable JsonElement json, @Nullable Type typeOfT, @Nullable JsonDeserializationContext context) {
        String stringValue;
        if (json != null) {
            try {
                if (json.isJsonPrimitive() && (stringValue = json.getAsString()) != null && stringValue.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(stringValue, "stringValue");
                    return mo66363a(stringValue);
                }
                return null;
            } catch (NumberFormatException e11) {
                C45463a.m100411d(e11, GsonCode.FROM_FAIL);
            }
        }
        return null;
    }
}
