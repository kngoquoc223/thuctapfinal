-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 28, 2020 at 10:58 AM
-- Server version: 8.0.20
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
CREATE TABLE IF NOT EXISTS `news` (
  `id` int NOT NULL,
  `title` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `short_content` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `theloai` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `img` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `hot` int NOT NULL,
  `new` int NOT NULL,
  `point` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`id`, `title`, `content`, `short_content`, `theloai`, `img`, `hot`, `new`, `point`) VALUES
(1, 'Conan - Thám tử lừng danh', 'Lấy bối cảnh tại đảo quốc sư tử, Cú Đấm Sapphire Xanh xoay quanh một viên ngọc khổng lồ đã chìm sâu dưới đáy đại dương từ cuối thế kỷ 19 mang tên \"Blue Sapphire\". Conan và đối thủ truyền kiếp của cậu - \"nhà ảo thuật dưới ánh trăng\" Kaito Kid bị cuốn vào một án mạng kinh hoàng tại khác sạn Marina Bay Sands cùng một âm mưu to lớn được che giấu tại đây. Liệu Conan có thành công ngăn chặn âm mưu của siêu trộm Kid?', 'truyện kể về thám tử tí hon Conan', 'Anime', 'conan.jpg', 1, 1, 8),
(2, 'One piece', 'Trong phim, băng hải tặc Mũ Rơm sẽ phải đối đầu với Guild Tesoro, kẻ sở hữu trái ác quỷ Gold - Gold và là chủ nhân của Gran Tesoro - Thành phố giải trí nổi bằng vàng lớn nhất thế giới. Gran Tesoro là một thành phố độc lập, quy tụ hàng trăm tay chơi và hải tặc trên khắp thế giới; một nơi mà đến chính phủ cũng không thể kiểm soát. Guild Tesoro thống trị tất cả mọi thứ, thậm chí là hải tặc hay chính phủ bằng Vàng và tham vọng của hắn ngày càng lớn dần. Cán cân quyền lực của Tân thế giới bắt đầu thay đổi từ đây …', 'nhân vật chính: Luffy', 'Anime', '11.png', 1, 0, 9),
(3, 'Thất hình đại tội', 'kể về cuộc hỗn loạn và thanh trừng giữa các tộc', 'nhân vật chính : 7 tội đồ', 'Anime', '3.jpg', 1, 0, 5),
(4, 'Sherlock holmes', 'Lần này, chàng thám tử tài ba của chúng ta cùng với người cộng sự đắc lực bác sĩ Watson phải đối mặt với một kẻ thù mới, cùng nhau vạch trần một âm mưu cực kỳ tàn bạo có thể hủy diệt cả quốc gia.', 'nhân vật chính : Sherlock Holmes', 'TrinhTham', '4.jpg', 0, 1, 5),
(5, 'Overlord', 'Chiến Dịch Overlord lấy bối cảnh tại thời điểm D-Day trong Thế Chiến thứ II, đêm trước khi các thủy quân lục chiến Đồng minh xâm chiếm Normandy. Máy bay của một nhóm binh sĩ bị tai nạn rơi xuống một khu vực bí ẩn do quân Phát xít Đức cai trị. Tại đây, họ phát hiện ra những sự thật đầy kinh hãi.', 'nhân vật chính : Momon và Guild của hắn', 'Anime', '33.jpg', 0, 1, 10),
(6, 'Harry Potter', 'Mở đầu phần 2 là khi bộ ba Harry, Ron và Hermione quay lại trường Hogwarts để tìm và phá hủy Trường Sinh Linh Giá cuối cùng của Voldermort. Nhưng khi Chúa tể Bóng Tối phát hiện ra nhiệm vụ họ đang thực hiện, cuộc chiến lớn nhất bắt đầu và cuộc sống mà họ từng trải qua sẽ không còn yên bình như trước.', 'nhân vật chính : Harry Potter và 2 đứa bạn', 'VienTuong', '6.jpg', 1, 0, 7),
(7, 'Avengers: Hồi Kết', 'Sau sự kiện hủy diệt tàn khốc, vũ trụ chìm trong cảnh hoang tàn. Với sự trợ giúp của những đồng minh còn sống sót, biệt đội siêu anh hùng Avengers tập hợp một lần nữa để đảo ngược hành động của Thanos và khôi phục lại trật tự của vũ trụ.', 'Phim cuối cùng của vũ trụ marvel: cái kết của thanos', 'VienTuong', 'end.jpg', 1, 1, 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
