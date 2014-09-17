require 'date'

# 使いドコロが限定されているが、拡張すれば、まぁ使えます
class HolidayUtils

  W_HOLIDAY = %w[true false false false false false true]
  
  # 前日を取得するために引く日数を返却します
  def get_draw_number
    draw_number = nil
    for i in 1..7 do
      weekend = W_HOLIDAY[(Date.today - i).wday]
      if weekend == "false"
        return draw_number = i
      end
    end
  end

end
