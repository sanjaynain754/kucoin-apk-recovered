package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.AtomicFile;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.database.VersionTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes34.dex */
class CachedContentIndex {
    static final String FILE_NAME_ATOMIC = "cached_content_index.exi";
    private static final int INCREMENTAL_METADATA_READ_LENGTH = 10485760;
    private final SparseArray<String> idToKey;
    private final HashMap<String, CachedContent> keyToContent;
    private final SparseBooleanArray newIds;

    @Nullable
    private Storage previousStorage;
    private final SparseBooleanArray removedIds;
    private Storage storage;

    public static final class DatabaseStorage implements Storage {
        private static final String COLUMN_ID = "id";
        private static final int COLUMN_INDEX_ID = 0;
        private static final int COLUMN_INDEX_KEY = 1;
        private static final int COLUMN_INDEX_METADATA = 2;
        private static final String COLUMN_METADATA = "metadata";
        private static final String TABLE_PREFIX = "ExoPlayerCacheIndex";
        private static final String TABLE_SCHEMA = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private static final int TABLE_VERSION = 1;
        private static final String WHERE_ID_EQUALS = "id = ?";
        private final DatabaseProvider databaseProvider;
        private String hexUid;
        private final SparseArray<CachedContent> pendingUpdates = new SparseArray<>();
        private String tableName;
        private static final String COLUMN_KEY = "key";
        private static final String[] COLUMNS = {"id", COLUMN_KEY, "metadata"};

        public static void delete(DatabaseProvider databaseProvider, long j11) throws DatabaseIOException {
            delete(databaseProvider, Long.toHexString(j11));
        }

        private void addOrUpdateRow(SQLiteDatabase sQLiteDatabase, CachedContent cachedContent) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(cachedContent.f2928id));
            contentValues.put(COLUMN_KEY, cachedContent.key);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) Assertions.checkNotNull(this.tableName), null, contentValues);
        }

        private void deleteRow(SQLiteDatabase sQLiteDatabase, int i11) {
            sQLiteDatabase.delete((String) Assertions.checkNotNull(this.tableName), WHERE_ID_EQUALS, new String[]{Integer.toString(i11)});
        }

        private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor getCursor() {
            return this.databaseProvider.getReadableDatabase().query((String) Assertions.checkNotNull(this.tableName), COLUMNS, null, null, null, null, null);
        }

        private static String getTableName(String str) {
            return TABLE_PREFIX + str;
        }

        private void initializeTable(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            VersionTable.setVersion(sQLiteDatabase, 1, (String) Assertions.checkNotNull(this.hexUid), 1);
            dropTable(sQLiteDatabase, (String) Assertions.checkNotNull(this.tableName));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.tableName + C33627eb.f69716f + TABLE_SCHEMA);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void delete() throws DatabaseIOException {
            delete(this.databaseProvider, (String) Assertions.checkNotNull(this.hexUid));
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public boolean exists() throws DatabaseIOException {
            try {
                return VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.hexUid)) != -1;
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void load(HashMap<String, CachedContent> map, SparseArray<String> sparseArray) throws IOException {
            Assertions.checkState(this.pendingUpdates.size() == 0);
            try {
                if (VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.hexUid)) != 1) {
                    SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        initializeTable(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursor = getCursor();
                while (cursor.moveToNext()) {
                    try {
                        CachedContent cachedContent = new CachedContent(cursor.getInt(0), (String) Assertions.checkNotNull(cursor.getString(1)), CachedContentIndex.readContentMetadata(new DataInputStream(new ByteArrayInputStream(cursor.getBlob(2)))));
                        map.put(cachedContent.key, cachedContent);
                        sparseArray.put(cachedContent.f2928id, cachedContent.key);
                    } catch (Throwable th3) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursor.close();
            } catch (SQLiteException e11) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onRemove(CachedContent cachedContent, boolean z11) {
            if (z11) {
                this.pendingUpdates.delete(cachedContent.f2928id);
            } else {
                this.pendingUpdates.put(cachedContent.f2928id, null);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onUpdate(CachedContent cachedContent) {
            this.pendingUpdates.put(cachedContent.f2928id, cachedContent);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeFully(HashMap<String, CachedContent> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    initializeTable(writableDatabase);
                    Iterator<CachedContent> it = map.values().iterator();
                    while (it.hasNext()) {
                        addOrUpdateRow(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.pendingUpdates.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeIncremental(HashMap<String, CachedContent> map) throws IOException {
            if (this.pendingUpdates.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i11 = 0; i11 < this.pendingUpdates.size(); i11++) {
                    try {
                        CachedContent cachedContentValueAt = this.pendingUpdates.valueAt(i11);
                        if (cachedContentValueAt == null) {
                            deleteRow(writableDatabase, this.pendingUpdates.keyAt(i11));
                        } else {
                            addOrUpdateRow(writableDatabase, cachedContentValueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.pendingUpdates.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        public DatabaseStorage(DatabaseProvider databaseProvider) {
            this.databaseProvider = databaseProvider;
        }

        private static void delete(DatabaseProvider databaseProvider, String str) throws DatabaseIOException {
            try {
                String tableName = getTableName(str);
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.removeVersion(writableDatabase, 1, str);
                    dropTable(writableDatabase, tableName);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void initialize(long j11) {
            String hexString = Long.toHexString(j11);
            this.hexUid = hexString;
            this.tableName = getTableName(hexString);
        }
    }

    public static class LegacyStorage implements Storage {
        private static final int FLAG_ENCRYPTED_INDEX = 1;
        private static final int VERSION = 2;
        private static final int VERSION_METADATA_INTRODUCED = 2;
        private final AtomicFile atomicFile;

        @Nullable
        private ReusableBufferedOutputStream bufferedOutputStream;
        private boolean changed;

        @Nullable
        private final Cipher cipher;
        private final boolean encrypt;

        @Nullable
        private final SecureRandom random;

        @Nullable
        private final SecretKeySpec secretKeySpec;

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void writeFile(HashMap<String, CachedContent> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamStartWrite = this.atomicFile.startWrite();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
                if (reusableBufferedOutputStream == null) {
                    this.bufferedOutputStream = new ReusableBufferedOutputStream(outputStreamStartWrite);
                } else {
                    reusableBufferedOutputStream.reset(outputStreamStartWrite);
                }
                ReusableBufferedOutputStream reusableBufferedOutputStream2 = this.bufferedOutputStream;
                DataOutputStream dataOutputStream2 = new DataOutputStream(reusableBufferedOutputStream2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iHashCachedContent = 0;
                    dataOutputStream2.writeInt(this.encrypt ? 1 : 0);
                    if (this.encrypt) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) Util.castNonNull(this.random)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) Util.castNonNull(this.cipher)).init(1, (Key) Util.castNonNull(this.secretKeySpec), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(reusableBufferedOutputStream2, this.cipher));
                        } catch (InvalidAlgorithmParameterException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e12) {
                            e = e12;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (CachedContent cachedContent : map.values()) {
                        writeCachedContent(cachedContent, dataOutputStream2);
                        iHashCachedContent += hashCachedContent(cachedContent, 2);
                    }
                    dataOutputStream2.writeInt(iHashCachedContent);
                    this.atomicFile.endWrite(dataOutputStream2);
                    Util.closeQuietly(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    Util.closeQuietly(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onRemove(CachedContent cachedContent, boolean z11) {
            this.changed = true;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void onUpdate(CachedContent cachedContent) {
            this.changed = true;
        }

        private int hashCachedContent(CachedContent cachedContent, int i11) {
            int i12;
            int iHashCode;
            int iHashCode2 = (cachedContent.f2928id * 31) + cachedContent.key.hashCode();
            if (i11 < 2) {
                long contentLength = ContentMetadata.getContentLength(cachedContent.getMetadata());
                i12 = iHashCode2 * 31;
                iHashCode = (int) (contentLength ^ (contentLength >>> 32));
            } else {
                i12 = iHashCode2 * 31;
                iHashCode = cachedContent.getMetadata().hashCode();
            }
            return i12 + iHashCode;
        }

        private boolean readFile(HashMap<String, CachedContent> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.atomicFile.exists()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.atomicFile.openRead());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i11 = dataInputStream2.readInt();
                    if (i11 >= 0 && i11 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.cipher == null) {
                                Util.closeQuietly(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.cipher.init(2, (Key) Util.castNonNull(this.secretKeySpec), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.cipher));
                            } catch (InvalidAlgorithmParameterException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e12) {
                                e = e12;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.encrypt) {
                            this.changed = true;
                        }
                        int i12 = dataInputStream2.readInt();
                        int iHashCachedContent = 0;
                        for (int i13 = 0; i13 < i12; i13++) {
                            CachedContent cachedContent = readCachedContent(i11, dataInputStream2);
                            map.put(cachedContent.key, cachedContent);
                            sparseArray.put(cachedContent.f2928id, cachedContent.key);
                            iHashCachedContent += hashCachedContent(cachedContent, i11);
                        }
                        int i14 = dataInputStream2.readInt();
                        boolean z11 = dataInputStream2.read() == -1;
                        if (i14 == iHashCachedContent && z11) {
                            Util.closeQuietly(dataInputStream2);
                            return true;
                        }
                        Util.closeQuietly(dataInputStream2);
                        return false;
                    }
                    Util.closeQuietly(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        Util.closeQuietly(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        Util.closeQuietly(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private void writeCachedContent(CachedContent cachedContent, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(cachedContent.f2928id);
            dataOutputStream.writeUTF(cachedContent.key);
            CachedContentIndex.writeContentMetadata(cachedContent.getMetadata(), dataOutputStream);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void delete() {
            this.atomicFile.delete();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public boolean exists() {
            return this.atomicFile.exists();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void load(HashMap<String, CachedContent> map, SparseArray<String> sparseArray) {
            Assertions.checkState(!this.changed);
            if (readFile(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.atomicFile.delete();
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeIncremental(HashMap<String, CachedContent> map) throws Throwable {
            if (this.changed) {
                storeFully(map);
            }
        }

        public LegacyStorage(File file, @Nullable byte[] bArr, boolean z11) {
            boolean z12;
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            if (bArr == null && z11) {
                z12 = false;
            } else {
                z12 = true;
            }
            Assertions.checkState(z12);
            if (bArr != null) {
                Assertions.checkArgument(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
                    throw new IllegalStateException(e11);
                }
            } else {
                Assertions.checkArgument(!z11);
                cipher = null;
                secretKeySpec = null;
            }
            this.encrypt = z11;
            this.cipher = cipher;
            this.secretKeySpec = secretKeySpec;
            this.random = z11 ? new SecureRandom() : null;
            this.atomicFile = new AtomicFile(file);
        }

        private CachedContent readCachedContent(int i11, DataInputStream dataInputStream) throws IOException {
            DefaultContentMetadata contentMetadata;
            int i12 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i11 >= 2) {
                contentMetadata = CachedContentIndex.readContentMetadata(dataInputStream);
            } else {
                long j11 = dataInputStream.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                ContentMetadataMutations.setContentLength(contentMetadataMutations, j11);
                contentMetadata = DefaultContentMetadata.EMPTY.copyWithMutationsApplied(contentMetadataMutations);
            }
            return new CachedContent(i12, utf, contentMetadata);
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void storeFully(HashMap<String, CachedContent> map) throws Throwable {
            writeFile(map);
            this.changed = false;
        }

        @Override // androidx.media3.datasource.cache.CachedContentIndex.Storage
        public void initialize(long j11) {
        }
    }

    public interface Storage {
        void delete() throws IOException;

        boolean exists() throws IOException;

        void initialize(long j11);

        void load(HashMap<String, CachedContent> map, SparseArray<String> sparseArray) throws IOException;

        void onRemove(CachedContent cachedContent, boolean z11);

        void onUpdate(CachedContent cachedContent);

        void storeFully(HashMap<String, CachedContent> map) throws IOException;

        void storeIncremental(HashMap<String, CachedContent> map) throws IOException;
    }

    public CachedContentIndex(DatabaseProvider databaseProvider) {
        this(databaseProvider, null, null, false, false);
    }

    public CachedContentIndex(@Nullable DatabaseProvider databaseProvider, @Nullable File file, @Nullable byte[] bArr, boolean z11, boolean z12) {
        Assertions.checkState((databaseProvider == null && file == null) ? false : true);
        this.keyToContent = new HashMap<>();
        this.idToKey = new SparseArray<>();
        this.removedIds = new SparseBooleanArray();
        this.newIds = new SparseBooleanArray();
        DatabaseStorage databaseStorage = databaseProvider != null ? new DatabaseStorage(databaseProvider) : null;
        LegacyStorage legacyStorage = file != null ? new LegacyStorage(new File(file, FILE_NAME_ATOMIC), bArr, z11) : null;
        if (databaseStorage == null || (legacyStorage != null && z12)) {
            this.storage = (Storage) Util.castNonNull(legacyStorage);
            this.previousStorage = databaseStorage;
        } else {
            this.storage = databaseStorage;
            this.previousStorage = legacyStorage;
        }
    }

    private CachedContent addNew(String str) {
        int newId = getNewId(this.idToKey);
        CachedContent cachedContent = new CachedContent(newId, str);
        this.keyToContent.put(str, cachedContent);
        this.idToKey.put(newId, str);
        this.newIds.put(newId, true);
        this.storage.onUpdate(cachedContent);
        return cachedContent;
    }

    public static boolean isIndexFile(String str) {
        return str.startsWith(FILE_NAME_ATOMIC);
    }

    @Nullable
    public CachedContent get(String str) {
        return this.keyToContent.get(str);
    }

    public Collection<CachedContent> getAll() {
        return Collections.unmodifiableCollection(this.keyToContent.values());
    }

    @Nullable
    public String getKeyForId(int i11) {
        return this.idToKey.get(i11);
    }

    public Set<String> getKeys() {
        return this.keyToContent.keySet();
    }

    public CachedContent getOrAdd(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        return cachedContent == null ? addNew(str) : cachedContent;
    }

    @WorkerThread
    public void initialize(long j11) throws IOException {
        Storage storage;
        this.storage.initialize(j11);
        Storage storage2 = this.previousStorage;
        if (storage2 != null) {
            storage2.initialize(j11);
        }
        if (this.storage.exists() || (storage = this.previousStorage) == null || !storage.exists()) {
            this.storage.load(this.keyToContent, this.idToKey);
        } else {
            this.previousStorage.load(this.keyToContent, this.idToKey);
            this.storage.storeFully(this.keyToContent);
        }
        Storage storage3 = this.previousStorage;
        if (storage3 != null) {
            storage3.delete();
            this.previousStorage = null;
        }
    }

    public void maybeRemove(String str) {
        CachedContent cachedContent = this.keyToContent.get(str);
        if (cachedContent != null && cachedContent.isEmpty() && cachedContent.isFullyUnlocked()) {
            this.keyToContent.remove(str);
            int i11 = cachedContent.f2928id;
            boolean z11 = this.newIds.get(i11);
            this.storage.onRemove(cachedContent, z11);
            if (z11) {
                this.idToKey.remove(i11);
                this.newIds.delete(i11);
            } else {
                this.idToKey.put(i11, null);
                this.removedIds.put(i11, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeEmpty() {
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.keyToContent.keySet()).iterator();
        while (it.hasNext()) {
            maybeRemove((String) it.next());
        }
    }

    @WorkerThread
    public void store() throws IOException {
        this.storage.storeIncremental(this.keyToContent);
        int size = this.removedIds.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.idToKey.remove(this.removedIds.keyAt(i11));
        }
        this.removedIds.clear();
        this.newIds.clear();
    }

    @WorkerThread
    public static void delete(DatabaseProvider databaseProvider, long j11) throws DatabaseIOException {
        DatabaseStorage.delete(databaseProvider, j11);
    }

    @VisibleForTesting
    public static int getNewId(SparseArray<String> sparseArray) {
        int iKeyAt;
        int size = sparseArray.size();
        int i11 = 0;
        if (size == 0) {
            iKeyAt = 0;
        } else {
            iKeyAt = sparseArray.keyAt(size - 1) + 1;
        }
        if (iKeyAt < 0) {
            while (i11 < size && i11 == sparseArray.keyAt(i11)) {
                i11++;
            }
            return i11;
        }
        return iKeyAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DefaultContentMetadata readContentMetadata(DataInputStream dataInputStream) throws IOException {
        int i11 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < i11; i12++) {
            String utf = dataInputStream.readUTF();
            int i13 = dataInputStream.readInt();
            if (i13 >= 0) {
                int iMin = Math.min(i13, 10485760);
                byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
                int i14 = 0;
                while (i14 != i13) {
                    int i15 = i14 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i15);
                    dataInputStream.readFully(bArrCopyOf, i14, iMin);
                    iMin = Math.min(i13 - i15, 10485760);
                    i14 = i15;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException("Invalid value size: " + i13);
            }
        }
        return new DefaultContentMetadata(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeContentMetadata(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = defaultContentMetadata.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        CachedContent orAdd = getOrAdd(str);
        if (orAdd.applyMetadataMutations(contentMetadataMutations)) {
            this.storage.onUpdate(orAdd);
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).f2928id;
    }

    public ContentMetadata getContentMetadata(String str) {
        CachedContent cachedContent = get(str);
        if (cachedContent != null) {
            return cachedContent.getMetadata();
        }
        return DefaultContentMetadata.EMPTY;
    }
}
