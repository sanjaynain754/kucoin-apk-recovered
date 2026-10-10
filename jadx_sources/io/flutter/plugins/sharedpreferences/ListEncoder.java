package io.flutter.plugins.sharedpreferences;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/ListEncoder;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "<init>", "()V", "encode", "", "list", "", "decode", "listString", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/ListEncoder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n808#2,11:521\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/ListEncoder\n*L\n517#1:521,11\n*E\n"})
public final class ListEncoder implements SharedPreferencesListEncoder {
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
    @NotNull
    public List<String> decode(@NotNull String listString) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(listString, "listString");
        Object object = new StringListObjectInputStream(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) object) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
    @NotNull
    public String encode(@NotNull List<String> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
