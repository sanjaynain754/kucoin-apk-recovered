package org.tensorflow.lite.support.metadata;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes61.dex */
final class ZipFile implements Closeable {
    private final ByteBufferChannel archive;
    private final Map<String, List<ZipEntry>> nameMap;

    public static class ZipEntry {
        private long dataOffset;
        private long localHeaderOffset;
        private String name;
        private long size;

        private ZipEntry() {
            this.dataOffset = -1L;
            this.size = -1L;
            this.localHeaderOffset = -1L;
        }

        public long getDataOffset() {
            return this.dataOffset;
        }

        public long getLocalHeaderOffset() {
            return this.localHeaderOffset;
        }

        public String getName() {
            return this.name;
        }

        public long getSize() {
            return this.size;
        }

        public void setDataOffset(long j11) {
            this.dataOffset = j11;
        }

        public void setLocalHeaderOffset(long j11) {
            this.localHeaderOffset = j11;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSize(long j11) {
            this.size = j11;
        }
    }

    public static class ZipParser {
        private final ByteBufferChannel archive;
        private final ByteBuffer intBuffer;
        private final ByteBuffer longBuffer;
        private final ByteBuffer shortBuffer;

        private ZipParser(ByteBufferChannel byteBufferChannel) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            this.longBuffer = byteBufferAllocate.order(byteOrder);
            this.intBuffer = ByteBuffer.allocate(4).order(byteOrder);
            this.shortBuffer = ByteBuffer.allocate(2).order(byteOrder);
            this.archive = byteBufferChannel;
        }

        private int getInt() {
            this.intBuffer.rewind();
            this.archive.read(this.intBuffer);
            this.intBuffer.flip();
            return this.intBuffer.getInt();
        }

        private long getLong() {
            this.longBuffer.rewind();
            this.archive.read(this.longBuffer);
            this.longBuffer.flip();
            return this.longBuffer.getLong();
        }

        private int getShort() {
            this.shortBuffer.rewind();
            this.archive.read(this.shortBuffer);
            this.shortBuffer.flip();
            return this.shortBuffer.getShort();
        }

        private void locateCentralDirectory() throws IOException {
            if (this.archive.size() < 22) {
                throw new ZipException("The archive is not a ZIP archive.");
            }
            this.archive.position(this.archive.size() - 22);
            if (getLong() != 101010256) {
                throw new ZipException("The archive is not a ZIP archive.");
            }
            skipBytes(8);
            this.archive.position(getInt());
        }

        private List<ZipEntry> parseCentralDirectory() throws IOException {
            ArrayList arrayList = new ArrayList();
            locateCentralDirectory();
            while (foundCentralFileheaderSignature()) {
                arrayList.add(parseCentralDirectoryEntry());
            }
            return arrayList;
        }

        private ZipEntry parseCentralDirectoryEntry() throws IOException {
            skipBytes(16);
            long j11 = getInt();
            skipBytes(4);
            int i11 = getShort();
            int i12 = getShort();
            int i13 = getShort();
            skipBytes(8);
            long j12 = getInt();
            byte[] bArr = new byte[i11];
            this.archive.read(ByteBuffer.wrap(bArr));
            String str = new String(bArr, Charset.forName("UTF-8"));
            skipBytes(i12 + i13);
            ZipEntry zipEntry = new ZipEntry();
            zipEntry.setSize(j11);
            zipEntry.setLocalHeaderOffset(j12);
            zipEntry.setName(str);
            return zipEntry;
        }

        private Map<String, List<ZipEntry>> parseLocalFileHeaderData(List<ZipEntry> list) {
            List list2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (ZipEntry zipEntry : list) {
                long localHeaderOffset = zipEntry.getLocalHeaderOffset();
                this.archive.position(26 + localHeaderOffset);
                zipEntry.setDataOffset(localHeaderOffset + 30 + ((long) getShort()) + ((long) getShort()));
                String name = zipEntry.getName();
                if (linkedHashMap.containsKey(name)) {
                    list2 = (List) linkedHashMap.get(name);
                } else {
                    ArrayList arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                    list2 = arrayList;
                }
                list2.add(zipEntry);
            }
            return linkedHashMap;
        }

        private void skipBytes(int i11) throws IOException {
            long jPosition = this.archive.position() + ((long) i11);
            if (jPosition > this.archive.size()) {
                throw new EOFException();
            }
            this.archive.position(jPosition);
        }

        private boolean foundCentralFileheaderSignature() {
            if (getInt() == 33639248) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, List<ZipEntry>> parseEntries() throws IOException {
            return parseLocalFileHeaderData(parseCentralDirectory());
        }
    }

    public static class ZipConstants {
        static final int CENATT = 36;
        static final int CENATX = 38;
        static final int CENCOM = 32;
        static final int CENCRC = 16;
        static final int CENDSK = 34;
        static final int CENEXT = 30;
        static final int CENFLG = 8;
        static final int CENHDR = 46;
        static final int CENHOW = 10;
        static final int CENLEN = 24;
        static final int CENNAM = 28;
        static final int CENOFF = 42;
        static final long CENSIG = 33639248;
        static final int CENSIZ = 20;
        static final int CENTIM = 12;
        static final int CENVEM = 4;
        static final int CENVER = 6;
        static final int ENDCOM = 20;
        static final int ENDHDR = 22;
        static final int ENDOFF = 16;
        static final long ENDSIG = 101010256;
        static final int ENDSIZ = 12;
        static final int ENDSUB = 8;
        static final int ENDTOT = 10;
        static final int EXTCRC = 4;
        static final int EXTHDR = 16;
        static final int EXTLEN = 12;
        static final long EXTSIG = 134695760;
        static final int EXTSIZ = 8;
        static final int INT_BYTE_SIZE = 4;
        static final int LOCCRC = 14;
        static final int LOCEXT = 28;
        static final int LOCFLG = 6;
        static final int LOCHDR = 30;
        static final int LOCHOW = 8;
        static final int LOCLEN = 22;
        static final int LOCNAM = 26;
        static final long LOCSIG = 67324752;
        static final int LOCSIZ = 18;
        static final int LOCTIM = 10;
        static final int LOCVER = 4;
        static final int LONG_BYTE_SIZE = 8;
        static final int SHORT_BYTE_SIZE = 2;

        private ZipConstants() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.archive.close();
    }

    public Set<String> getFileNames() {
        return this.nameMap.keySet();
    }

    public InputStream getRawInputStream(String str) {
        Preconditions.checkArgument(this.nameMap.containsKey(str), String.format("The file, %s, does not exist in the zip file.", str));
        ZipEntry zipEntry = this.nameMap.get(str).get(0);
        return new BoundedInputStream(this.archive, zipEntry.getDataOffset(), zipEntry.getSize());
    }

    private ZipFile(ByteBufferChannel byteBufferChannel, Map<String, List<ZipEntry>> map) {
        this.archive = byteBufferChannel;
        this.nameMap = map;
    }

    public static ZipFile createFrom(ByteBufferChannel byteBufferChannel) throws IOException {
        Preconditions.checkNotNull(byteBufferChannel);
        return new ZipFile(byteBufferChannel, new ZipParser(byteBufferChannel).parseEntries());
    }
}
