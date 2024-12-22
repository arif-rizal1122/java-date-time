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

# LOCAL DATE TIME

1. Seperti dari nama class nya, LocalDateTime, class ini digunakan sebagai representasi tanggal dan waktu, mirip seperti class Date
2. LocalDateTime juga immutable, jadi tidak bisa diubah setelah dibuat, jika diubah otomatis akan membuat object baru
3. Cara pembuatan, cara mengubah, memanipulasi nya pun sama seperti LocalDate dan LocalTime
4. Dan format default untuk LocalDateTime adalah menggunakan format yyyy-MM-ddTHH:mm:ss.nano

¥ Konversi dari dan ke LocalDate
1. Kadang ada kebutuhan kita melakukan konversi data dari LocalDate ke LocalDateTime atau juga sebaliknya
2. Untuk melakukan konversi dari LocalDateTime ke LocalDate, kita bisa menggunakan method toLocalDate()
3. Sedangkan untuk melakukan konversi dari LocalDate ke LocalDateTime, kita bisa mennggunakann method atTime()


¥ Konversi dari dan ke LocalTime
1. Selain melakukan konnversi untuk tipe data LocalDate, kita juga bisa lakukan ke dan dari tipe data LocalTime.
2. Untuk melakukan konversi dari LocalDateTime ke LocalTime, kita bisa menggunakan method toLocalTime()
3. Sedangkan untuk melakukan konversi dari LocalTime ke LocalDateTime, kita bisa mennggunakann method atDate()


# Year, YearMonth dan MonthDay

1. Di Date & Time API baru, terdapat class Year , YearMonth dan MonthDay
2. Seperti dari nama class nya, Year digunakan untuk tanggal yang hanya berisi data tahun, dan YearMonth adalah tanggal yang berisi data tahun dan bulan, dan MonthDay adalah tanggal berisi bulan dan hari
3. Kenapa menggunakan Year? Kenapa tidak langsung menggunakan angka saja? Misal 2020. Di Year, sudah banyak sekali method yang bisa kita gunakan untuk manipulasi data tanggal dan konversi ke tipe lain seperti LocalDate misal nya
4. Begitu juga dengan YearMonth dan MonthDay
5. Format default untuk Year adalah yyyy dan format untuk YearMonth adalah yyyy-MM dan format untuk MonthDay adalah --MM-dd


# ZoneId dan ZoneOffset

1. Sebelumnya kita sudah tahu bahwa terdapat class TimeZone di Java sebagai representasi time zone
2. Namun di Java Date & Time API terbaru, terdapat class baru untuk mendukung time zone, yaitu ZoneId dan ZoneOffset

¥ ZoneId
1. ZoneId mirip dengan TimeZone, dimana ini merupakan representasi time zone id
2. Untuk mendapatkan default time zone, kita bisa menggunakan method ZoneId.systemDefault()
3. Untuk membuat ZoneId, caranya bisa menggunakan method ZoneId.of(“Zone Id”)
4. Dan untuk mendapatkan semua daftar time zone id yang didukung oleh Java, kita bisa menggunakan method

¥ ZoneOffset
1. Jika ZoneId merupakan representasi timezone menggunakan time zone id
2. Pada class ZonenOffset, iin adalah format time zone dengan offset dari time zone Greenwich/UTC, misalnya +07:00 atau -01:00
3. Untuk membuat ZoneOffset, kita bisa menggunakan method of
4. ZoneOffset adalah turunan dari ZoneId, jadi semua parameter yang menerima object ZoneId, bisa kita isi dengan ZoneOffset

# ZonedDateTime

1. Pada class LocalDateTime, secara default tidak ada informasi time zone sama sekali pada class tersebut
2. Jika kita ingin membuat tanggal dan waktu yang mendukung time zone, kita bisa menggunakan class ZonedDateTime
3. Class ZonedDateTime sama seperti LocalDateTime, perbedaannya hanyalah mendukung time zone
4. Format default untuk ZonedDateTime adalah yyyy-MM-ddTHH:mm:ss.nano(+/-)ZoneOffset[ZoneId], dimana ZoneId tidak wajib, dan jika ZoneId diisi, maka nilai ZoneOffset akan di hiraukan

¥ Mengubah Time Zone
1. Untuk mengubah time zone pada ZonedDateTime, terdapat dua cara
2. Pertama, mengubah time zone, tanpa merubah tanggal dan waktu. Caranya dengan menggunakan method withZoneSameLocal(ZoneId)
3. Kedua, mengubah time zone, sehingga tanggal dan waktu mengikuti timezone yang baru. Caranya dengan menggunakan method withZoneSameInstance(ZoneId)


# OffsetTime dan OffsetDateTime

1. Java Date & Time API memiliki class yang bernama OffsetTime dan OffsetDateTime
2. Class OffsetTime adalah seperti LocalTime, namun memiliki time zone offset
3. Dan Class OffsetDateTime adalah seperti LocalDateTime, namun memiliki time zone offset
4. Sekilas OffsetDateTime mirip dengan ZonedDateTime, yang membedakan adalah kalo OffsetDateTime hanya bisa menggunakan ZoneOffset, tidak bisa menggunakan ZoneId
5. Format default OffsetTime adalah HH:mm:ss(+/-)ZoneOffset
6. Format default OffsetDateTime adalah yyyy-MM-ddTHH:mm:ss(+/-)ZoneOffset


1. Apa yang bisa kita lakukan di LocalTime dan LocalDateTime bisa juga dilakukan di OffsetTime dan OffsetDateTime
2. Selain itu kita juga bisa konversi data dari dan ke non offset


¥ Konversi ke dan dari Non Offset
1. Apa yang bisa kita lakukan di LocalTime dan LocalDateTime bisa juga dilakukan di OffsetTime dan OffsetDateTime
2. Selain itu kita juga bisa konversi data dari dan ke non offset









