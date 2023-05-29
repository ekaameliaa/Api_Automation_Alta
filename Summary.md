Testing in CI/CD Pipeline
Introduction CI / CD
CI atau Continuous Integrations adalah praktik pengembangan software di mana developer merubah kode serta melakukan merge pada sebuah repository atau penyimpanan secara reguler dan terus-menerus, nantinya jika ada push maupun commit yang baru Maka otomatis build dan test akan dijalankan Sehingga hasilnya bisa langsung diketahui. Jadi jika ada kesalahan dalam proses CI ini maka pihak development bisa langsung melakukan tindakan atau action, caranya adalah dengan memperbarui kode sehingga kualitasnya bisa ditingkatkan sekaligus menghemat waktu ketika melakukan validate update. CI sendiri merupakan solusi untuk menyederhanakan tahapan pengembangan software sehingga isu bisa diperbaiki. di dalam CI ada 3 state yang harus dilatih seperti build, Unit Test serta integration test.
CD atau Continuous Delivery atau deployment yang mana memiliki makna yang berbeda-beda. continuous delivery adalah proses setelah continuous integration dimana developer sudah menjalankan build dan test namun memilih untuk tidak melimpahkannya ke production Jadi biasanya ketika proses develompmet selesai jadi continuous delevery ini membutuhkan action untuk merilis ke production, sedangkan Continuous deployment adalah fase akhir dari CI/CD Pipeline yaitu fase setelah continuous integration dan continuous delivery selesai dijalankan, Continuous deployment secara otomatis akan rilis ke production jadi ketika kondisi integration dan continuous delivery selesai dijalankan otomatis.
perbedaan antara Continuous delivery and Continuous deployment yaitu
Continuous delivery

- butuh manual action untuk rilis ke production
  Continuous deployment
- otomatis rilis ke production tanpa approval dari developer
  What makes for Good CI
- Decoupled Stages: Setiap langkah dalam CI harus melakukan satu tugas yang terfokus.
- Repeatable: otomatisasi dengan cara yang dapat diulang secara konsisten, tools juga dapat digunakan oleh developer
- Fail fast: Fail at the first sign of trouble
  What makes for Good CD
- Design with system in mind: Mencakup sebanyak mungkin bagian dari penerapan, seperti : Aplikasi, Infrastruktur, Konfigurasi, Data
  Saluran pipa
- pipelines: percaya diri untuk melakukan production
- Globally Unique versions: Mengetahui keadaan sistem setiap saat, Mampu menunjukkan perbedaan antara keadaan saat ini dan masa depan
  Pada CI / CD Process terdapat Commit - bulid - test - deploy
  Benefits of implementing CI
- Mendeteksi bug pada tahap awal - semakin dini bug terdeteksi, semakin sedikit kerusakan yang ditimbulkannya
- Mengurangi jumlah bug.
- Proses pengembangan menjadi lebih transparan - tim diberitahu ketika proses pembangunan gagal dan apa penyebabnya.
- Efisien - karena seluruh proses diotomatisasi, pengujian manual menjadi berkurang.
  Benefits of implementing CD
- Kurangi risiko - proses penerapan bisa jadi rumit. Proses ini bisa terdiri dari banyak langkah. Semakin rumit prosesnya, semakin besar kemungkinan terjadinya kesalahan manusia. Dengan mengotomatisasi proses ini, kami dapat memastikan bahwa setiap penerapan akan terlihat serupa.
- Mengurangi biaya.
- Proses yang sepenuhnya otomatis dan transparan.
- Rilis dapat terjadi lebih sering.
  Continuous Integration Costs
- Tim perlu menulis tes otomatis.
- Server untuk pengujian otomatis.
- Developer perlu menggabungkan perubahan mereka sesering mungkin
  CI /CD Tools
- Jenkins adalah tools automation open source yang ditulis dalam bahasa Java dengan plugin yang dibangun untuk integrasi berkelanjutan.
- GitLab CI (Continuous Integration) adalah bagian dari GitLab yang mengelola proyek dan antarmuka pengguna dan memungkinkan pengujian unit pada setiap commit dan menunjukkan dengan pesan peringatan ketika ada kegagalan build.
- Atlassian Bamboo adalah server build integrasi berkelanjutan yang melakukan: build, pengujian, dan rilis otomatis di satu tempat.
- Circle CI adalah tolls CI fleksibel yang berjalan di envirotment apa pun seperti cross-platform mobile app, server API Python, atau cluster Docker. tools ini mengurangi bug dan meningkatkan kualitas aplikasi.
  Github Actions
- Workflows adalah proses otomatis yang dapat dikonfigurasi yang akan menjalankan satu atau beberapa jobs. workflow ditulis di file YAML yang dimasukkan ke dalam repositori dan akan berjalan ketika ditrigger oleh suatu peristiwa di repositori, atau dapat ditrigger secara manual, atau pada jadwal yang ditentukan.
- Event adalah aktivitas spesifik dalam repositori yang memicu alur kerja dijalankan. Misalnya, aktivitas dapat berasal dari GitHub ketika seseorang membuat pull request, membuka isu, atau mendorong komit ke repositori.
- runner adalah server yang menjalankan alur kerja Anda ketika dipicu. Setiap runner dapat menjalankan satu pekerjaan dalam satu waktu. GitHub menyediakan runner Ubuntu Linux, Microsoft Windows, dan macOS untuk menjalankan alur kerja Anda.
- Jobs adalah serangkaian langkah dalam alur kerja yang dijalankan pada runner yang sama. Setiap langkah adalah skrip shell yang akan dieksekusi, atau tindakan yang akan dijalankan. Langkah-langkah dieksekusi secara berurutan dan bergantung satu sama lain. Karena setiap langkah dieksekusi pada runner yang sama, Anda dapat berbagi data dari satu langkah ke langkah lainnya.
- Actions adalah aplikasi khusus untuk platform GitHub Actions yang melakukan tugas yang kompleks namun sering diulang. Gunakan Actions untuk membantu mengurangi jumlah kode berulang yang Anda tulis di file alur kerja.
