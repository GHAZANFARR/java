package Hashing;

import org.w3c.dom.ls.LSOutput;

public class BucketHash {
    public static void main(String[] args) {

        String key = "orange";
        int bucketSize = 16;

        int hash = key.hashCode();

        int bucketIndex = (hash & 0x7FFFFFFF) % bucketSize;
        System.out.println("Bucket index for 'Orange': " + bucketIndex);
    }
}
