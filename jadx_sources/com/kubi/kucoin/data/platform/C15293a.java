package com.kubi.kucoin.data.platform;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.data.platform.a */
/* JADX INFO: compiled from: Converter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"parseIpAddress", "", "Lokhttp3/ResponseBody;", "LAppNet_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converter.kt\ncom/kubi/kucoin/data/platform/ConverterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,23:1\n739#2,9:24\n37#3:33\n36#3,3:34\n*S KotlinDebug\n*F\n+ 1 Converter.kt\ncom/kubi/kucoin/data/platform/ConverterKt\n*L\n16#1:24,9\n16#1:33\n16#1:34,3\n*E\n"})
public final class C15293a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m32045a(@NotNull ResponseBody responseBody) throws IOException {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(responseBody, "<this>");
        String strString = responseBody.string();
        if (!StringsKt.contains$default((CharSequence) strString, (CharSequence) "@", false, 2, (Object) null)) {
            return "";
        }
        List<String> listSplit = new Regex("@").split(strString, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = CollectionsKt.emptyList();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
            break;
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        return strArr.length >= 3 ? strArr[2] : "";
    }
}
