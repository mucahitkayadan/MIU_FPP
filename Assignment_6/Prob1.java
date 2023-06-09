/**
 * Represents a table that matches objects of String type with a character index.
 */
public class MyTable {
    private Entry[] entries;

    /**
     * Initializes a new instance of the MyTable class.
     * The table is initialized with an array of size 26 to store entries for characters 'a' to 'z'.
     */
    public MyTable() {
        entries = new Entry[26];
    }

    /**
     * Retrieves the string associated with the given character from the table.
     *
     * @param c The character to look up.
     * @return The string associated with the character, or null if not found.
     */
    public String get(char c) {
        int index = c - 'a';
        if (index >= 0 && index < 26 && entries[index] != null) {
            return entries[index].str;
        }
        return null;
    }

    /**
     * Adds a new entry to the table, associating the given character with the provided string.
     *
     * @param c The character to add.
     * @param s The string to associate with the character.
     */
    public void add(char c, String s) {
        int index = c - 'a';
        if (index >= 0 && index < 26) {
            entries[index] = new Entry(c, s);
        }
    }

    /**
     * Returns a string representation of the table, including all entries.
     *
     * @return A formatted string representation of the table.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Represents an entry in the table, associating a character with a string.
     */
    private class Entry {
        char ch;
        String str;

        /**
         * Initializes a new instance of the Entry class with the given character and string.
         *
         * @param ch  The character of the entry.
         * @param str The string associated with the character.
         */
        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        /**
         * Returns a string representation of the entry.
         *
         * @return A formatted string of the form "ch->str".
         */
        public String toString() {
            return ch + "->" + str;
        }
    }

    /**
     * A sample usage of the MyTable class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t);
    }
}
