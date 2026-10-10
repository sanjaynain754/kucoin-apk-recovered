package com.google.firebase.util;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RandomUtil.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m90084d2 = {"ALPHANUMERIC_ALPHABET", "", "getALPHANUMERIC_ALPHABET$annotations", "()V", "nextAlphanumericString", "Lkotlin/random/Random;", SessionDescription.ATTR_LENGTH, "", "com.google.firebase-firebase-common"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRandomUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1#2:43\n1549#3:44\n1620#3,3:45\n*S KotlinDebug\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n*L\n34#1:44\n34#1:45,3\n*E\n"})
public final class RandomUtilKt {

    @NotNull
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    @NotNull
    public static final String nextAlphanumericString(@NotNull Random random, int i11) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("invalid length: " + i11).toString());
        }
        IntRange intRangeUntil = RangesKt.until(0, i11);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Character.valueOf(StringsKt.random(ALPHANUMERIC_ALPHABET, random)));
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }
}
