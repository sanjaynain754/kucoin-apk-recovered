package im;

import androidx.core.util.Pools;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: im.c */
/* JADX INFO: compiled from: BookTransformer.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nJ,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020!H\u0002J4\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020!H\u0002J,\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u001a\"\u0004\b\u0000\u0010**\b\u0012\u0004\u0012\u0002H*0\u001dH\u0002J\u001c\u0010+\u001a\u00020,*\u00020(2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010-\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006."}, m90084d2 = {"Lcom/kubi/kumex/logic/book/BookTransformer;", "", "<init>", "()V", "mDirection", "", "mDisplayCount", "mAmountConfig", "Lcom/kubi/kumex/logic/book/BookAmountConfig;", "mSource", "Lcom/kubi/kumex/logic/book/BookEntity;", "mBookPool", "com/kubi/kumex/logic/book/BookTransformer$mBookPool$1", "Lcom/kubi/kumex/logic/book/BookTransformer$mBookPool$1;", "setDisplayCount", "displayCount", "setDisplayDirection", "direction", "setAmountConfig", "amountConfig", "transformer", "Lcom/kubi/kumex/logic/book/DisplayBook;", "bookEntity", "transformerDepth", "book", "merge", "", "Lcom/kubi/kumex/logic/book/BookItem;", "list", "", "", "config", "isBuy", "", "filter", "mergeData", "display", "Lcom/kubi/kumex/logic/book/DisplayBookItem;", "filterData", "totalAmount", "Ljava/math/BigDecimal;", "asMutableList", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.PRICE, "", "getBookEntity", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBookTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookTransformer.kt\ncom/kubi/kumex/logic/book/BookTransformer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,331:1\n1#2:332\n1869#3,2:333\n1869#3,2:335\n774#3:337\n865#3,2:338\n1563#3:340\n1634#3,3:341\n*S KotlinDebug\n*F\n+ 1 BookTransformer.kt\ncom/kubi/kumex/logic/book/BookTransformer\n*L\n129#1:333,2\n138#1:335,2\n218#1:337\n218#1:338,2\n273#1:340\n273#1:341,3\n*E\n"})
public final class C38683c {

    /* JADX INFO: renamed from: a */
    public int f86704a;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BookAmountConfig f86706c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BookEntity f86707d;

    /* JADX INFO: renamed from: b */
    public int f86705b = 6;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final a f86708e = new a();

    /* JADX INFO: renamed from: im.c$a */
    /* JADX INFO: compiled from: BookTransformer.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kumex/logic/book/BookTransformer$mBookPool$1", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/kubi/kumex/logic/book/BookItem;", "acquire", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends Pools.SynchronizedPool<BookItem> {
        public a() {
            super(50);
        }

        @Override // androidx.core.util.Pools.SynchronizedPool, androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BookItem acquire() {
            BookItem bookItem = (BookItem) super.acquire();
            if (bookItem == null) {
                return new BookItem(0, null, null, null, null, 31, null);
            }
            return bookItem;
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<DisplayBookItem> m87438b(List<BookItem> list, BookAmountConfig bookAmountConfig, BigDecimal bigDecimal) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (BookItem bookItem : list) {
            arrayList.add(new DisplayBookItem(C42180b.m92640e(bookItem.getPrice(), null, C38214b.m86254c(bookAmountConfig.getContract()), true, false, false, 0, null, 121, null), C27025c.m66566d(Boolean.valueOf(bookAmountConfig.getIsTotal())) ? C38684d.m87449b(bookItem.getTotalAmount(), bookAmountConfig.getContract(), bookAmountConfig.getQtyUnit()) : C38684d.m87448a(bookItem.getCurrentAmount(), bookItem.getPrice(), bookAmountConfig.getContract(), bookAmountConfig.getQtyUnit()), com.kubi.kumex.logic.calculator.a.a(bookItem.getTotalAmount(), bigDecimal, 2, RoundingMode.HALF_UP).floatValue(), false, 8, null));
        }
        return m87437a(arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BookEntity getF86707d() {
        return this.f86707d;
    }

    /* JADX INFO: renamed from: e */
    public final List<BookItem> m87441e(List<double[]> list, BookAmountConfig bookAmountConfig, boolean z11) {
        ArrayList arrayList = new ArrayList();
        char c11 = 0;
        if (list.size() == 1) {
            BookItem bookItemAcquire = this.f86708e.acquire();
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(list.get(0)[0]));
            bookItemAcquire.m87433e(this.f86704a);
            bookItemAcquire.m87434f(m87442f(bigDecimal, bookAmountConfig, z11));
            bookItemAcquire.m87435g(bigDecimal);
            bookItemAcquire.m87432d(new BigDecimal(String.valueOf(list.get(0)[1])));
            arrayList.add(bookItemAcquire);
            return arrayList;
        }
        if (list.size() > 1) {
            BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(list.get(0)[0]));
            double d11 = list.get(0)[1];
            int size = list.size();
            int i11 = 1;
            while (i11 < size) {
                BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(list.get(i11)[c11]));
                double d12 = list.get(i11)[1];
                if (bigDecimal2.compareTo(bigDecimal3) == 0) {
                    d11 += d12;
                } else {
                    BookItem bookItemAcquire2 = this.f86708e.acquire();
                    bookItemAcquire2.m87433e(this.f86704a);
                    bookItemAcquire2.m87435g(bigDecimal2);
                    bookItemAcquire2.m87434f(m87442f(bigDecimal2, bookAmountConfig, z11));
                    bookItemAcquire2.m87432d(new BigDecimal(String.valueOf(d11)));
                    arrayList.add(bookItemAcquire2);
                    bigDecimal2 = bigDecimal3;
                    d11 = d12;
                }
                if (i11 == list.size() - 1) {
                    BookItem bookItemAcquire3 = this.f86708e.acquire();
                    bookItemAcquire3.m87433e(this.f86704a);
                    bookItemAcquire3.m87435g(bigDecimal2);
                    bookItemAcquire3.m87434f(m87442f(bigDecimal2, bookAmountConfig, z11));
                    bookItemAcquire3.m87432d(new BigDecimal(String.valueOf(d11)));
                    arrayList.add(bookItemAcquire3);
                }
                i11++;
                c11 = 0;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final String m87442f(BigDecimal bigDecimal, BookAmountConfig bookAmountConfig, boolean z11) {
        try {
            return C42180b.m92640e(bigDecimal, z11 ? RoundingMode.DOWN : RoundingMode.UP, C38214b.m86254c(bookAmountConfig.getContract()), true, false, true, 0, null, 104, null);
        } catch (Throwable unused) {
            return "0";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C38683c m87443g(@NotNull BookAmountConfig amountConfig) {
        Intrinsics.checkNotNullParameter(amountConfig, "amountConfig");
        this.f86706c = amountConfig;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C38683c m87444h(int i11) {
        this.f86705b = i11;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final DisplayBook m87445i(@Nullable BookEntity bookEntity) {
        BigDecimal totalAmount;
        BookEntity bookEntity2 = bookEntity == null ? this.f86707d : bookEntity;
        this.f86707d = bookEntity2;
        BigDecimal totalAmount2 = null;
        if (bookEntity2 == null) {
            return null;
        }
        int i11 = this.f86705b;
        BookAmountConfig bookAmountConfig = this.f86706c;
        if (bookAmountConfig == null) {
            return null;
        }
        List<BookItem> listM87441e = m87441e(bookEntity2.getBids(), bookAmountConfig, true);
        List<BookItem> listM87439c = m87439c(listM87441e, i11, bookAmountConfig, true);
        Iterator<T> it = listM87439c.iterator();
        if (it.hasNext()) {
            totalAmount = ((BookItem) it.next()).getTotalAmount();
            while (it.hasNext()) {
                BigDecimal totalAmount3 = ((BookItem) it.next()).getTotalAmount();
                if (totalAmount.compareTo(totalAmount3) < 0) {
                    totalAmount = totalAmount3;
                }
            }
        } else {
            totalAmount = null;
        }
        List<BookItem> listM87441e2 = m87441e(bookEntity2.getAsks(), bookAmountConfig, false);
        List<BookItem> listM87439c2 = m87439c(listM87441e2, i11, bookAmountConfig, false);
        Iterator<T> it2 = listM87439c2.iterator();
        if (it2.hasNext()) {
            totalAmount2 = ((BookItem) it2.next()).getTotalAmount();
            while (it2.hasNext()) {
                BigDecimal totalAmount4 = ((BookItem) it2.next()).getTotalAmount();
                if (totalAmount2.compareTo(totalAmount4) < 0) {
                    totalAmount2 = totalAmount4;
                }
            }
        }
        BigDecimal bigDecimalMax = C27039d.m66656p(totalAmount2).max(C27039d.m66656p(totalAmount));
        Intrinsics.checkNotNull(bigDecimalMax);
        List<DisplayBookItem> listM87438b = m87438b(listM87439c, bookAmountConfig, bigDecimalMax);
        List<DisplayBookItem> listM87438b2 = m87438b(listM87439c2, bookAmountConfig, bigDecimalMax);
        if (C27039d.m66656p(totalAmount2).add(C27039d.m66656p(totalAmount)).compareTo(BigDecimal.ZERO) <= 0) {
            return new DisplayBook(bookEntity2.getSymbol(), listM87438b2, listM87438b, null, null, null, null, 96, null);
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it3 = listM87441e2.iterator();
        while (it3.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((BookItem) it3.next()).getCurrentAmount());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        Iterator<T> it4 = listM87441e.iterator();
        while (it4.hasNext()) {
            bigDecimalValueOf2 = bigDecimalValueOf2.add(((BookItem) it4.next()).getCurrentAmount());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "add(...)");
        }
        BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = bigDecimalValueOf.add(bigDecimalValueOf2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        int iIntValue = com.kubi.kumex.logic.calculator.a.a(bigDecimalMultiply, bigDecimalAdd, 0, RoundingMode.HALF_UP).intValue();
        return new DisplayBook(bookEntity2.getSymbol(), listM87438b2, listM87438b, Integer.valueOf(iIntValue), Integer.valueOf(100 - iIntValue), bookEntity2.getAsks(), bookEntity2.getBids());
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final BookEntity m87446j(@NotNull BookEntity book) {
        Intrinsics.checkNotNullParameter(book, "book");
        BookAmountConfig bookAmountConfig = this.f86706c;
        if (bookAmountConfig == null) {
            return book;
        }
        InterfaceC38213a contract = bookAmountConfig.getContract();
        InterfaceC41049a qtyUnit = bookAmountConfig.getQtyUnit();
        ArrayList arrayList = new ArrayList();
        for (double[] dArr : book.getBids()) {
            double d11 = dArr[0];
            arrayList.add(new double[]{d11, C27039d.m66656p(qtyUnit.mo90007a(contract, new BigDecimal(String.valueOf(d11)), new BigDecimal(String.valueOf(dArr[1])), null)).doubleValue()});
        }
        ArrayList arrayList2 = new ArrayList();
        for (double[] dArr2 : book.getAsks()) {
            double d12 = dArr2[0];
            arrayList2.add(new double[]{d12, C27039d.m66656p(qtyUnit.mo90007a(contract, new BigDecimal(String.valueOf(d12)), new BigDecimal(String.valueOf(dArr2[1])), null)).doubleValue()});
        }
        return BookEntity.copy$default(book, null, null, null, null, arrayList, arrayList2, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final <T> List<T> m87437a(List<? extends T> list) {
        if (TypeIntrinsics.isMutableList(list)) {
            return list;
        }
        return new ArrayList(list);
    }

    /* JADX INFO: renamed from: c */
    public final List<BookItem> m87439c(List<BookItem> list, int i11, BookAmountConfig bookAmountConfig, boolean z11) {
        InterfaceC38213a contract = bookAmountConfig.getContract();
        InterfaceC41049a qtyUnit = bookAmountConfig.getQtyUnit();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(Math.pow(10.0d, -qtyUnit.mo90017k(contract))));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BookItem) obj).getCurrentAmount().compareTo(bigDecimal) >= 0) {
                arrayList.add(obj);
            }
        }
        List<BookItem> listM87437a = m87437a(arrayList);
        if (i11 > 0 && i11 < listM87437a.size()) {
            listM87437a = !z11 ? listM87437a.subList(listM87437a.size() - i11, listM87437a.size()) : listM87437a.subList(0, i11);
        }
        if (!z11) {
            int size = listM87437a.size();
            while (true) {
                size--;
                if (-1 < size) {
                    BookItem bookItem = listM87437a.get(size);
                    BigDecimal bigDecimalM66656p = C27039d.m66656p(qtyUnit.mo90007a(contract, bookItem.getPrice(), bookItem.getCurrentAmount(), null));
                    if (size == listM87437a.size() - 1) {
                        bookItem.m87436h(bigDecimalM66656p);
                    } else {
                        BigDecimal bigDecimalAdd = bigDecimalM66656p.add(listM87437a.get(size + 1).getTotalAmount());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                        bookItem.m87436h(bigDecimalAdd);
                    }
                } else {
                    CollectionsKt.reverse(listM87437a);
                    return listM87437a;
                }
            }
        } else {
            int size2 = listM87437a.size();
            for (int i12 = 0; i12 < size2; i12++) {
                BookItem bookItem2 = listM87437a.get(i12);
                BigDecimal bigDecimalM66656p2 = C27039d.m66656p(qtyUnit.mo90007a(contract, bookItem2.getPrice(), bookItem2.getCurrentAmount(), null));
                if (i12 == 0) {
                    bookItem2.m87436h(bigDecimalM66656p2);
                } else {
                    BigDecimal bigDecimalAdd2 = bigDecimalM66656p2.add(listM87437a.get(i12 - 1).getTotalAmount());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                    bookItem2.m87436h(bigDecimalAdd2);
                }
            }
            return listM87437a;
        }
    }
}
