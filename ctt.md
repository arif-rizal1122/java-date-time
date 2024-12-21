# PENGENALAN JAVA DATE-TIME

1. Sejak awal, di Java representasi tipe data tanggal dan waktu adalah java.util.Date dan java.util.Calendar
2. Java Date dan Time API merupakan fitur baru sejak Java versi 8

¥ Masalah Dengan Class Date dan Calendar
1. Thread Safety, class Date dan Calendar tidak thread safe, dalam artian berbahaya jika diakses secara paralel (beberapa proses mengakses object yang sama).
2. Desain class Date dan Calendar tidak terlalu bagus di desain dari awal, hal ini menyulitkan ketika kita butuh melakukan operasi yang melibatkan tanggal dan waktu, seperti mencari durasi waktu, periode, menambah waktu, dan operasi lainnya.
3. Desain tanggal dan waktu dengan timezone agak menyulitkan di class Date dan Calendar.


¥ Package java.time
1. Date & Time API yang baru sekarang berada dalam satu package, yaitu package java.time
2. Sekarang ada banyak sekali class-class yang terdapat di package tersebut, dan kegunaannya berbeda-beda, yang akan kita bahas secara detail di chapter-chapter selanjutnya
3. https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/time/package-summary.html


¥ Perbedaan dengan Date dan Time API Baru
1. Object di Date dan Time API baru bersifat immutable dan thread safe, artinya tidak bisa diubah, jika diubah, itu akan membuat object yang baru sehingga aman digunakan para proses paralel
2. Terdapat pemisahan antara Tanggal dan Waktu, tidak digabung seperti pada class Date
3. Mendukung data lain seperti durasi, periode dan lain-lain

# DATE

1. Sebelum membahas Date dan Time API yang baru, kita akan sekilas membahas class Date
2. Date adalah representasi tanggal dan juga waktu di Java sejak versi awal
3. Karena tidak ada pemisahan antara tanggal dan waktu di class Date, ini memang agak menyulitkan jika kita hanya butuh misal tanggal saja, dan waktu saja
4. https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Date.html


¥ MILISECOND

Date menggunakan milisecond setelah UNIX epoch (January 1, 1970 00:00:00 UTC)
Untuk mendapatkan milisecond saat ini, di Java kita bisa menggunakan System.currentTimeMilis()
https://currentmillis.com/ 


# CALENDER

1. Class Calendar adalah class yang digunakan sebagai pembantu class Date
2. Pada class Date, hampir semua method untuk melakukan manipulasi tanggal dan waktu sudah ditandai sebagai @Deprecated, artinya tidak direkomendasikan digunakan lagi
3. Untuk itu, kita butuh menggunakan class Calendar untuk memanipulasi tanggal dan waktu
4. Class Calendar tidak memiliki public constructor, sehingga untuk membuat object Calendar, kita akan menggunakan static method milik calendar bernama getInstance()

# TIMEZONE

1. Class TimeZone merupakan representasi dari data time zone
2. Secara default, jika kita membuat object Calendar, dan tidak menggunakan TimeZone, secara otomatis objectnya akan menggunakan default TimeZone, yaitu timezone sistem operasi yang kita gunakan.
3. Untuk mengetahui default time zone, kita bisa gunakan method TimeZone.getDefault()
4. Sedangkan jika ingin membuat object TimeZone, kita bisa gunakan method TimeZone.getTimeZone(“Zone ID”)
5. Untuk mengetahui semua zone id yang didukung oleh Java, kita bisa gunakan TimeZone.getAvailableIDs()

¥ TimeZone Date
1. Class Date tidak memiliki method apapun untuk mendapatkan time zone atau mengubah time zone
2. Secara default, saat kita membuat object Date, object tersebut akan menggunakan time zone default

# LOCALDATE

1. LocalDate adalah class di Date & Time API baru
2. LocalDate merupakan representasi untuk tipe data tanggal (tanpa waktu)
3. Default format waktu untuk LocalDate adalah yyyy-MM-dd

¥ Mengubah LocalDate
1. Object LocalDate juga bisa kita ubah tanggal nya jika kita mau
2. Untuk mengubah tanggal, kita bisa menggunakan method with, seperti withYear, withMonth, dan lain-lain
3. Perlu diingat, mengubah LocalDate akan menciptakan object LocalDate baru, artinya object aslinya tidak akan berubah, karena bersifat immutable


¥ Manipulasi LocalDate
1. Object LocalDate juga bisa kita manipulasi, seperti menambah tanggal atau mengurangi tanggal.
2. Untuk menambah tanggal, kita bisa gunakan method plus, seperti plusYears, plusMonths, plusDays, dan lain-lain
3. Untuk mengurangi tanggal, kita bisa gunakan method minus, seperti minusYears, minusMonths, minusDays, dan lain-lain
4. Perlu diingat, manipulasi LocalDate akan menciptakan object LocalDate baru, artinya object aslinya tidak akan berubah, karena bersifat immutable


¥ Mengambil Tanggal LocalDate
1. LocalDate juga mendukung pengambilan detail data tanggal nya, seperti tahun, bulan, hari dalam bulan, hari dalam tahun, dan lain-lain
2. Untuk mengambil data tanggal, kita bisa menggunakan method get, seperti getYear, getMonth, dan lain-lain

# LOCALTIME

1. Berbeda dengan LocalDate, LocalTime merupakan representasi data waktu (tanpa tanggal)
2. Cara penggunaanya dan method-method nya hampir sama dengan LocalDate
3. LocalTime juga immutable, jadi kita tidak bisa mengubahnya setelah datanya dibuat, jika kita ubah, maka akan menghasilkan object LocalTime baru
4. Format standard LocalTime adalah HH:mm:ss.nano, dimana second dan nano second nya optional


















