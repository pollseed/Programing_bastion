
# 日付のヘルパークラス
class date_helper

	# 指定した日付の次の平日を返す.
	def get_next_weekday(date)

		# 休日を取得する.
		holiday = HolidayMaster.find(:all, :conditions => ["holiday = ?", date])
		if (holiday != nil && holiday.blank?)

			# 休日に対する次の平日を返す.
			return holiday.next_weekday
		else

			# 次の日も平日のため加算して返す.
			return date + 1
		end
	end

end
