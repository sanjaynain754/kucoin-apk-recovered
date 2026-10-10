package com.kubi.mine.lib.language;

import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.entity.LanguageEntity;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.mine.lib.language.d */
/* JADX INFO: compiled from: LanguageRepository.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"toLanguageEntity", "Lcom/kubi/sdk/function/language/entity/LanguageEntity;", "Lcom/kubi/sdk/function/language/LanguageType;", "MineLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLanguageRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageRepository.kt\ncom/kubi/mine/lib/language/LanguageRepositoryKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
public final class C18963d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final LanguageEntity m41692a(@NotNull LanguageType languageType) {
        Object next;
        Intrinsics.checkNotNullParameter(languageType, "<this>");
        Iterator<T> it = LanguageRepository.f35074a.m41684h().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((LanguageEntity) next).getType(), languageType.getLocalString()));
        LanguageEntity languageEntity = (LanguageEntity) next;
        return languageEntity == null ? new LanguageEntity(languageType.getLocalString(), languageType.getLanguage(), null, 4, null) : languageEntity;
    }
}
